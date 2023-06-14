package com.prectice.udemy;

import java.math.BigDecimal;

public class SimpleInterestRunner {
    public static void main(String [] args) {
        SimpleInterestCalculate calculate = new SimpleInterestCalculate("4500.00", "7.5");
        BigDecimal totalValue = calculate.calculateTotalValue(5);
        System.out.println(totalValue);

    }
}
