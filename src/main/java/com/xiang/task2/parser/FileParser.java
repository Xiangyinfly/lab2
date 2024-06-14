package com.xiang.task2.parser;

/**
 * An abstract data type representing a file parser.
 * Mutability/Immutability: This interface is immutable. Implementations can be mutable or immutable.
 * Specification Fields:
 *  - fileName: The position of the file to be parsed.
 */
public interface FileParser {
    /**
     * Parses the given file and returns the parsing result.
     *
     * @param fileName the position of the file to be parsed.
     * @return the parsing result as a string
     */
    String parse(String fileName);
}
