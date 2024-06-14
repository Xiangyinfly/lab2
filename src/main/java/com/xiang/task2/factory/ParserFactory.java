package com.xiang.task2.factory;

import com.xiang.task2.parser.FileParser;

/**
 * An abstract data type representing a factory for creating file parsers.
 * Mutability/Immutability: This interface is immutable. Implementations can be mutable or immutable.
 * Specification Methods:
 * - getParser(): Creates and returns a new FileParser instance.
 */
public interface ParserFactory {
    /**
     * Creates and returns a new FileParser instance.
     * @return a new FileParser instance
     */
    FileParser getParser();
}
