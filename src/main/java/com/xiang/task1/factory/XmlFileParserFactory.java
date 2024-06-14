package com.xiang.task1.factory;

import com.xiang.task1.parser.FileParser;
import com.xiang.task1.parser.XmlFileParser;

public class XmlFileParserFactory implements ParserFactory {
    @Override
    public FileParser getParser() {
        return new XmlFileParser();
    }
}
