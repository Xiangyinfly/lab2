package com.xiang;

import com.xiang.task3.coffee.Coffee;
import com.xiang.task3.coffee.Decaf;
import com.xiang.task3.coffee.Espresso;
import com.xiang.task3.seasoning.Mocha;
import com.xiang.task3.seasoning.Seasoning;
import com.xiang.task3.seasoning.Soy;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
@SuppressWarnings("all")
public class Task3ClientTest {
    @Test
    public void testEspressoWithSoyAndMocha() {

        Coffee espresso = new Espresso();
        espresso.addSeasoning(new Soy());
        espresso.addSeasoning(new Mocha());
        assertEquals(10, espresso.getTotalCost(),0);
    }

    @Test
    public void testDecafWithMocha() {
        List<Seasoning> seasonings = new ArrayList<>();
        seasonings.add(new Mocha());

        Coffee decaf = new Decaf();
        decaf.addSeasoning(new Mocha());
        assertEquals(5.0, decaf.getTotalCost(),0);
    }

    @Test
    public void testEspressoWithoutSeasoning() {
        Coffee espresso = new Espresso();
        assertEquals(3.0, espresso.getTotalCost(),0);
    }


}
