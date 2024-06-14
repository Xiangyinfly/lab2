package com.xiang.task2.factory;

import com.xiang.task2.parser.FileParser;
import com.xiang.task2.parser.JsonFileParser;

public class JsonFileParserFactory implements ParserFactory {
    /**
     * Factory implementation for creating JsonFileParser instances.
     *
     * Abstraction Function:
     *  AF(c) = A factory that creates JSON file parser instances.
     *
     * Representation Invariant:
     *  RI(c) = None
     *
     * Safety from Representation Exposure:
     *  No mutable state. All fields are private and final.
     */
    @Override
    public FileParser getParser() {
        return new JsonFileParser();
    }
}
