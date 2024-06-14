package com.xiang.task3;

import com.xiang.task3.coffee.Coffee;
import com.xiang.task3.coffee.Decaf;
import com.xiang.task3.seasoning.Mocha;
import com.xiang.task3.seasoning.Seasoning;
import com.xiang.task3.seasoning.SteamedMilk;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Coffee decaf = new Decaf();
        decaf.addSeasoning(new Mocha());
        decaf.addSeasoning(new SteamedMilk());

        System.out.println(decaf.getTotalCost());
    }
}
