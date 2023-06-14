package com.prectice.udemy;

import java.math.BigDecimal;
import java.math.MathContext;

public class AllOperationPerformForCalculate {
    public static void main(String [] args){
        AllMethodForOperation addition=new AllMethodForOperation(2,3);
        System.out.println(addition.add());
        BigDecimal number1=new BigDecimal("35.5");
        System.out.println(number1);
        BigDecimal number2=new BigDecimal("34.44");
        System.out.println(number2);
        System.out.println(number1.add(number2));
        System.out.println(new BigDecimal("100"));

        BigDecimal integer=new BigDecimal("25");
        System.out.println(integer.sqrt(new MathContext(23)));
    }
}
