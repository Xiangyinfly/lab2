package com.xiang.task3.coffee;

import com.xiang.task3.seasoning.Seasoning;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract data type representing a coffee.
 * Mutability/Immutability: This class is mutable.
 * Specification Methods:
 *  - getPrice(): Returns the price of the coffee.
 *  - getTotalCost(): Returns the total price of the coffee including seasonings.
 *  - addSeasoning(Seasoning): add one seasoning into the coffee.
 */
public abstract class Coffee {
    protected List<Seasoning> seasonings = new ArrayList<>();

    /**
     * Returns the price of the coffee.
     * @return the price of the coffee
     */
    public abstract Double getPrice();

    /**
     * Returns the total price of the coffee including seasonings.
     * @return the total price of the coffee including seasonings
     */
    public double getTotalCost() {
        double sum = seasonings.isEmpty() ? 0 : seasonings.stream().mapToDouble(Seasoning::getPrice).sum();
        return sum + getPrice();
    }

    /**
     * add one seasoning into the coffee.
     * @param seasoning the seasoning client wants to add
     */
    public void addSeasoning(Seasoning seasoning) {
        this.seasonings.add(seasoning);
    }
}
