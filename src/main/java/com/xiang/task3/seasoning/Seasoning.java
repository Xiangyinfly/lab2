package com.xiang.task3.seasoning;

/**
 * An abstract data type representing a seasoning.
 * Mutability/Immutability: This interface is immutable. Implementations can be mutable or immutable.
 * Specification Methods:
 *  - getPrice(): Returns the price of the seasoning.
 */
public abstract class Seasoning {

    /**
     * Returns the price of the seasoning.
     * @return the price of the seasoning
     */
    public abstract Double getPrice();
}
