package com.prectice.udemy;

import java.math.BigDecimal;

public class SimpleInterestCalculate {

    private BigDecimal principle;
    private BigDecimal interest;
    SimpleInterestCalculate(String string,String inter){
        this.principle=new BigDecimal(string);
        this.interest=new BigDecimal(inter).divide(new BigDecimal(100));

    }
    public BigDecimal calculateTotalValue(int noOfYear){
        BigDecimal numberOfYear=new BigDecimal(noOfYear);
      BigDecimal totalValue=  principle.add(
              principle.multiply(interest)
                      .multiply(numberOfYear)
      );

        return totalValue;
    }

}
