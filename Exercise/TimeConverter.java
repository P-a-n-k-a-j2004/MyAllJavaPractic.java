package com.prectice.udemy.Exercise;

public class TimeConverter {
        public static int convertHoursToMinutes(int hours) {
           int minute;
            // Validation for hours : if hours is less than 0 return -1
            if(hours <0){
                return -1;
            }
            //here convert hour into minute , finding by hour multiplying by minute and assign in minute
           minute=hours*60;
            return minute;
        }

        public static int convertDaysToMinutes(int days) {
            int minutes;
            // Validation for day : if day is less than 0 return -1
            if(days<0){
                return -1;
            }
            //here convert day to minutes , finding by multiplying day into hour into minute and assign in minutes
            minutes=days*24*60;

            return minutes;
        }


    public static void main(String[] args) {
           // TimeConverter convert=new TimeConverter();
        // here the class instance is not use because they methods are static it is directly invokes (call) by using
        //method name

            System.out.println( convertHoursToMinutes(24));
    }
}
