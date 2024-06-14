package com.xiang.task2.env;

import com.xiang.task2.parser.FileParser;
import java.util.List;

/**
 * An environment that holds a list of file parsers and uses them to parse files.
 * This class is mutable.
 */
public class Environment implements FileParser {
     /*
     Abstraction Function (AF)
     AF(fileParsers) = An environment that uses the file parsers in fileParsers to parse files.

     Representation Invariant (RI)
     fileParsers is not null and contains only non-null FileParser objects.

     Safety from Representation Exposure
     The field fileParsers is private and final. It is defensively copied in the constructor to avoid
     exposing the internal representation to clients.
     */

    // The list of file parsers used to parse files
    private final List<FileParser> fileParsers;

    /**
     * Constructs an Environment with a list of file parsers.
     *
     * @param fileParsers the list of file parsers
     * @throws IllegalArgumentException if fileParsers is null
     */
    public Environment(List<FileParser> fileParsers) {
        if (fileParsers == null) {
            throw new IllegalArgumentException("fileParsers must not be null");
        }
        this.fileParsers = List.copyOf(fileParsers);
    }

    /**
     * Parses the given file using all file parsers in this environment and returns the combined parsed content.
     *
     * @param fileName the name of the file to parse
     * @return the combined parsed content of the file
     * @throws NullPointerException if fileName is null
     */
    @Override
    public String parse(String fileName) {
        if (fileName == null) {
            throw new NullPointerException("fileName must not be null");
        }
        StringBuilder parsedFile = new StringBuilder();
        for (FileParser fileParser : fileParsers) {
            parsedFile.append(fileParser.parse(fileName));
        }
        return parsedFile.toString();
    }
}
