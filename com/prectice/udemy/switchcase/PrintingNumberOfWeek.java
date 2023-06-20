package com.prectice.udemy.switchcase;

import java.util.Scanner;

import static java.lang.System.exit;

public class PrintingNumberOfWeek {
    public static void main(String[] args) {
      for(;;){  //new Scanner(System.in);
        System.out.println("Enter 1 for Sunday," +
                "\n2 for Monday," +
                "\n3 for Tuesday," +
                "\n4 for Wednesday," +
                "\n5 for Thursday," +
                "\n6 for Friday," +
                "\n7 for Saturday");
        short choice = new Scanner(System.in).nextShort();

        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:choice=3;
                System.out.println("Tuesday");
                break;
            case 4:choice=4;
                System.out.println("Wednesday");
                break;
            case 5:choice=5;
                System.out.println("Thursday");
                break;
            case 6:choice=6;
                System.out.println("Friday");
                break;
            case 7:choice=7;
                System.out.println("Saturday");
                break;
            case 8:exit(0);
                break;
            default:
                System.out.println("Abe Bevkoop one week me kevel seven days hote hai. Dekh ke Choose kar." +
                        "\n this is the babu bheya Style here,Sale Dekh ke dayle kar, " +
                        "or wrna sale ka khopdi tod hihihihihi...");
        }
        // System.out.println(choice);
    }

    }
}
