package com.xiang.task1.factory;

import com.xiang.task1.parser.FileParser;
import com.xiang.task1.parser.JsonFileParser;

// mutable type
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
