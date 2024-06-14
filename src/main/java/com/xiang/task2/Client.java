package com.xiang.task2;

import com.xiang.task2.env.Environment;
import com.xiang.task2.env.EnvironmentLoader;

public class Client {
    public static void main(String[] args) {
        Environment test = EnvironmentLoader.loadEnvironment("test");
        Environment production = EnvironmentLoader.loadEnvironment("production");
        test.parse("haha");
    }
}
