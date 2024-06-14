package com.xiang.task2.factory;

import com.xiang.task2.parser.FileParser;
import com.xiang.task2.parser.XmlFileParser;

public class XmlFileParserFactory implements ParserFactory {
    @Override
    public FileParser getParser() {
        return new XmlFileParser();
    }
}
