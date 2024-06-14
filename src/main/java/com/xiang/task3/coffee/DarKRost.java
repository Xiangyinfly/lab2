package com.xiang.task3.coffee;

import com.xiang.task3.seasoning.Seasoning;

public class DarKRost extends Coffee {
    /**
     * Concrete implementation of Coffee for DarKRost.
     * Abstraction Function:
     *  AF(e) = An DarKRost coffee that calculates its price based on a base price and the prices of the added seasonings.
     *
     * Representation Invariant:
     *  RI(e) = The base price of DarKRost must be a positive double.
     *
     * Safety from Representation Exposure:
     *  All fields are private. No internal state is exposed.
     */

    /**
     * Returns the price of the coffee.
     * @return the price of the coffee
     */
    @Override
    public Double getPrice() {
        return 1.0;
    }

}
