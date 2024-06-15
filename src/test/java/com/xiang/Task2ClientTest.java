package com.xiang;

import com.xiang.task2.env.Environment;
import com.xiang.task2.env.EnvironmentLoader;
import org.junit.Test;

public class Task2ClientTest {
    @Test
    public void test() {
        Environment test = EnvironmentLoader.loadEnvironment("test");
        test.parse("haha");
    }

    @Test
    public void production() {
        Environment production = EnvironmentLoader.loadEnvironment("production");
        production.parse("haha");
    }
}
