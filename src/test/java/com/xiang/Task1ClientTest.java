package com.xiang;

import com.xiang.task1.factory.JsonFileParserFactory;
import com.xiang.task1.factory.ParserFactory;
import com.xiang.task1.factory.XmlFileParserFactory;
import com.xiang.task1.parser.FileParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1ClientTest {
    @Test
    public void testJson() {
        ParserFactory jsonFileParserFactory = new JsonFileParserFactory();
        FileParser jsonFileParser = jsonFileParserFactory.getParser();
        assertEquals("Json文件解析完毕", jsonFileParser.parse("haha"));

    }

    @Test
    public void testXml() {
        ParserFactory xmlFileParserFactory = new XmlFileParserFactory();
        FileParser xmlFileParserFactoryParser = xmlFileParserFactory.getParser();
        assertEquals("Xml文件解析完毕", xmlFileParserFactoryParser.parse("haha"));

    }

}
