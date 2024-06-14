package com.xiang.task1;

import com.xiang.task1.factory.JsonFileParserFactory;
import com.xiang.task1.factory.ParserFactory;
import com.xiang.task1.parser.FileParser;

public class Client {
    public static void main(String[] args) {
        ParserFactory jsonFileParserFactory = new JsonFileParserFactory();
        FileParser jsonFileParser = jsonFileParserFactory.getParser();
        System.out.println(jsonFileParser.parse("haha"));
    }
}
