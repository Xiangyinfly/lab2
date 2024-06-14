package com.xiang.task1.parser;

//mutable type
public class JsonFileParser implements FileParser {
    /**
     * Concrete implementation of FileParser for parsing JSON files.
     * Abstraction Function:
     *  AF(c) = A JSON file parser that parses files of type JSON and returns the content as a string.
     *
     * Representation Invariant:
     *  RI(c) = The file must be a valid JSON file.
     *
     * Safety from Representation Exposure:
     *  All fields are private and final. No internal state is exposed.
     */
    @Override
    public String parse(String fileName) {
        return "Json文件解析完毕";
    }
}
