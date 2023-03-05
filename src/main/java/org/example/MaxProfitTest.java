package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {
    @Test
    public void testMaxProfit() {
        int[] prices1 = {7,1,5,3,6,4};
        int expected1 = 5;
        int result1 = MaxProfit.maxProfit(prices1);
        Assert.assertEquals(expected1, result1);

        int[] prices2 = {7,6,4,3,1};
        int expected2 = 0;
        int result2 = MaxProfit.maxProfit(prices2);
        Assert.assertEquals(expected2, result2);

    }
}
