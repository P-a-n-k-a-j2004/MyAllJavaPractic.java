package com.prectice.udemy.switchcase;

import java.util.Scanner;

import static java.lang.System.exit;

public class IsWeekAndIsDays {
    public static boolean isWeek(int week) {
        for (; ; ) {

            switch (week) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:

                    System.out.println("Wednesday");
                    break;
                case 5:

                    System.out.println("Thursday");
                    break;
                case 6:

                    System.out.println("Friday");
                    break;
                case 7:

                    System.out.println("Saturday");
                    break;
                case 8:
                    exit(0);
                    break;
                default:
                    System.out.println("Abe Bevkoop one week me kevel seven days hote hai. Dekh ke Choose kar." +
                            "\n this is the babu bheya Style here,Sale Dekh ke dayle kar, " +
                            "or wrna sale ka khopdi tod hihihihihi...");
            }
        }
    }

    public static boolean isDays(String day){

        switch(day){
            case "january":System.out.println("January");break;
            case "fabrrary":System.out.println("January");break;
        }

    }

    public static void main(String[] args) {

    }
}
