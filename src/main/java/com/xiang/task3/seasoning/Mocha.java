package com.xiang.task3.seasoning;

public class Mocha extends Seasoning {
    /**
     * Concrete implementation of Seasoning for Mocha.
     * Abstraction Function:
     *  AF(s) = A Mocha seasoning that adds a specific price to the coffee.
     *
     * Representation Invariant:
     *  RI(s) = The price of Mocha must be a positive double.
     *
     * Safety from Representation Exposure:
     *  All fields are private. No internal state is exposed.
     */


    /**
     * Returns the price of the seasoning.
     *
     * @return the price of the seasoning
     */
    @Override
    public Double getPrice() {
        return 3.0;
    }
}
