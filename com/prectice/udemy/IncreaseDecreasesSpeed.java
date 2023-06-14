package com.prectice.udemy;

public class IncreaseDecreasesSpeed {
    public static void main(String [] args){
        IncreaseDecreaseMethod ducat =new IncreaseDecreaseMethod();
        IncreaseDecreaseMethod honda=new IncreaseDecreaseMethod();
            ducat.setSpeed(100);
            ducat.increase(250);
            honda.setSpeed(100);
            honda.increase(200);

        System.out.println(ducat.getSpeed());
        System.out.println(honda.getSpeed());
       // System.out.println("After increasing Bike Speed.");




//        System.out.println("After Increasing Bike Speed We Decrease Speed.");
//       System.out.println("Ducat Speed Decreasing: "+ ducat.DecreasesSpeed(150));
//        System.out.println("honda Speed Decreasing: " +honda.DecreasesSpeed(50));




    }
}
