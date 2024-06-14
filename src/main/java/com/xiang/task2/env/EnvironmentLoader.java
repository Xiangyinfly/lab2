package com.xiang.task2.env;

import com.xiang.task2.parser.FileParser;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

public class EnvironmentLoader {
    // Abstraction Function (AF)
    // AF(env) = A mapping of environment names to lists of file parsers that should be used in those environments.

    // Representation Invariant (RI)
    // env is not null, and each key in env is a non-null string representing an environment name.
    // Each value in env is a non-null list containing non-null FileParser objects.

    // Safety from Representation Exposure
    // The env map is static and private, preventing direct access from outside the class.
    // Defensive copying is not needed for static initialization, but could be added if methods to modify env were added.

    private static final Map<String, List<FileParser>> env = new HashMap<>();

    static {
        Properties properties = new Properties();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/env.properties"))) {
            properties.load(bufferedReader);
            properties.entrySet().forEach(e -> {
                if (e.getKey().toString().contains("env")) {
                    env.put(e.getValue().toString(), new ArrayList<>());
                }
            });

            properties.entrySet().forEach(e -> {
                if (e.getKey().toString().contains("parser")) {
                    String name = e.getKey().toString().split("\\.")[0];
                    String parserString = "com.xiang.task2.factory." + e.getValue().toString() + "FileParserFactory";
                    try {
                        Class<?> factoryClass = Class.forName(parserString);
                        Object o = factoryClass.getDeclaredConstructor().newInstance();
                        Method getParser = factoryClass.getDeclaredMethod("getParser");
                        FileParser fileParser = (FileParser) getParser.invoke(o);
                        env.get(name).add(fileParser);
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Loads the environment configuration for the given environment name.
     *
     * @param envName the name of the environment
     * @return the Environment object containing the parsers for the specified environment
     * @throws IllegalArgumentException if envName is null or if no environment with the given name is found
     */
    public static Environment loadEnvironment(String envName) {
        if (envName == null) {
            throw new IllegalArgumentException("envName must not be null");
        }
        List<FileParser> parsers = env.get(envName);
        if (parsers == null) {
            throw new IllegalArgumentException("No environment found for name: " + envName);
        }
        return new Environment(parsers);
    }


}
