package com.Youtube.Practice;

import java.util.*;
import java.lang.*;

import static java.lang.System.exit;

public class MyVectorClass {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> myList = new Vector<>();
        Vector<String> myList2 = new Vector<>();
        Vector<Character> myCharacter = new Vector<>();
        Vector<Double> myDoubleList = new Vector<>();
        Vector<Float> myFloatList = new Vector<>();
do{
        System.out.println("Enter which type wrapper class you will use here like Integer etc. : ");
        String choice = sc.nextLine();

        switch (choice) {
            case "Integer":
//                Vector <Integer> myList=new Vector<>();
                System.out.println("Enter how many value you want to add : ");
                Integer myInt = sc.nextInt();
                System.out.println("Enter all value : ");

                for (int i = 0; i <= myInt - 1; i++) {
                    Integer AllValue = sc.nextInt();
                    myList.addElement(AllValue);
                }
                System.out.println();
                System.out.println(myList);
                break;


            case "String":

                System.out.println("Enter how many String you want to add : ");
                Integer myString = sc.nextInt();
                System.out.println("Enter all String : ");

                for (int i = 0; i <= myString - 1; i++) {
                    String AllValue2 = sc.nextLine();
                    myList2.addElement(AllValue2);
                }
                System.out.println();
                System.out.println(myList2);
                break;
            case "Character":

                System.out.println("Enter how many value you want to add : ");
                Integer myChar = sc.nextInt();
                System.out.println("Enter all value : ");

                for (int i = 0; i <= myChar - 1; i++) {
                    Character allCharacter = sc.next().charAt(0);
                    myCharacter.addElement(allCharacter);
                }
                System.out.println();
                System.out.println(myCharacter);
                break;

            case "Double":

                System.out.println("Enter how many value you want to add : ");
                Integer myDouble = sc.nextInt();
                System.out.println("Enter all value : ");

                for (int i = 0; i <= myDouble - 1; i++) {
                    Double allDoubles = sc.nextDouble();
                    myDoubleList.addElement(allDoubles);
                }
                System.out.println();
                System.out.println(myDoubleList);
                break;

            case "Float":

                System.out.println("Enter how many value you want to add : ");
                Integer myFloat = sc.nextInt();
                System.out.println("Enter all value : ");

                for (int i = 0; i <= myFloat - 1; i++) {
                    Float myFloatValue = sc.nextFloat();
                    myFloatList.addElement(myFloatValue);
                }
                System.out.println();
                System.out.println(myFloatList);
                break;

            case "DeleteInteger":
                System.out.println("Enter which value you want to Delete in Integer");
                Integer deleteInteger = sc.nextInt();
                myList.removeElement(deleteInteger);
                System.out.println("All Data After remove in Integer  " + myList);
                System.out.println("If you want to remove an element using index number then yes press 1\n" +
                        "other press 2");
                Integer ch = sc.nextInt();
                if (ch == 1) {
                    System.out.println("Enter which index element you want to remove :");
                    Integer elementIndex1 = sc.nextInt();
                    myList.removeElementAt(elementIndex1);
                    System.out.println("All Data After remove index in Integer  " + myList);
                } else {
                    System.out.println("Okay if You want to remove All Element In This Vector " +
                            "if yes press 1 or other press 2 ");
                    Integer removeAll = sc.nextInt();
                    if (removeAll == 1) {
                        myList.removeAllElements();
                        System.out.println("Your All Element Deleted Successfully here..Bay");
                        System.out.println("All Data After removeAll in Integer  " + myList);
                    } else {
                        System.out.println("Okay...Samjh Gya See you......");
                    }
                }
                break;
            case "DeleteString":
                System.out.println("Enter which value you want to Delete in String");
                String deleteString = sc.nextLine();
                myList2.removeElement(deleteString);
                System.out.println("All Data After remove in String  " + myList2);
                System.out.println("If you want to remove an element using index number then yes press 1\n" +
                        "other press 2");
                Integer ch2 = sc.nextInt();
                if (ch2 == 1) {
                    System.out.println("Enter which index element you want to remove :");
                    Integer elementIndex2 = sc.nextInt();
                    myList2.removeElementAt(elementIndex2);
                    System.out.println("All Data After remove index in String  " + myList2);
                } else {
                    System.out.println("Okay if You want to remove All Element In This Vector " +
                            "if yes press 1 or other press 2 ");
                    Integer removeAll = sc.nextInt();
                    if (removeAll == 1) {
                        myList2.removeAllElements();
                        System.out.println("Your All Element Deleted Successfully here..Bay");
                        System.out.println("All Data After removeAll in String  " + myList2);
                    } else {
                        System.out.println("Okay...Samjh Gya See you......");
                    }
                }
                break;


            case "DeleteCharacter":
                System.out.println("Enter which value you want to Delete in Character");
                Integer deleteCharacter = sc.nextInt();
                myCharacter.removeElement(deleteCharacter);
                System.out.println("If you want to remove an element using index number then yes press 1\n" +
                        "other press 2");
                Integer ch3 = sc.nextInt();
                if (ch3 == 1) {
                    System.out.println("Enter which index element you want to remove :");
                    Integer elementIndex3 = sc.nextInt();
                    myCharacter.removeElementAt(elementIndex3);
                    System.out.println("All Data After remove index in Character  " + myCharacter);
                } else {
                    System.out.println("Okay if You want to remove All Element In This Vector " +
                            "if yes press 1 or other press 2 ");
                    Integer removeAll = sc.nextInt();
                    if (removeAll == 1) {
                        myCharacter.removeAllElements();
                        System.out.println("Your All Element Deleted Successfully here..Bay");
                        System.out.println("All Data After removeAll in Character  " + myCharacter);
                    } else {
                        System.out.println("Okay...Samjh Gya See you......");
                    }
                }
                break;


            case "DeleteFloat":
                System.out.println("Enter which value you want to Delete in Float");
                Integer deleteFloat = sc.nextInt();
                myFloatList.removeElement(deleteFloat);
                System.out.println("If you want to remove an element using index number then yes press 1\n" +
                        "other press 2");
                Integer ch4 = sc.nextInt();
                if (ch4 == 1) {
                    System.out.println("Enter which index element you want to remove :");
                    Integer elementIndex3 = sc.nextInt();
                    myFloatList.removeElementAt(elementIndex3);
                    System.out.println("All Data After remove given index in Float  " + myFloatList);
                } else {
                    System.out.println("Okay if You want to remove All Element In This Vector " +
                            "if yes press 1 or other press 2 ");
                    Integer removeAll = sc.nextInt();
                    if (removeAll == 1) {
                        myFloatList.removeAllElements();
                        System.out.println("Your All Element Deleted Successfully here..Bay");
                        System.out.println("All Data After removeAll in Float  " + myFloatList);
                    } else {
                        System.out.println("Okay...Samjh Gya See you......");
                    }
                }
                break;


            case "DeleteDouble":
                System.out.println("Enter which value you want to Delete in Integer");
                Integer deleteDouble = sc.nextInt();
                myDoubleList.removeElement(deleteDouble);
                System.out.println("All Data After remove in Double  " + myDoubleList);
                System.out.println("If you want to remove an element using index number then yes press 1\n" +
                        "other press 2");
                Integer ch5 = sc.nextInt();
                if (ch5 == 1) {
                    System.out.println("Enter which index element you want to remove :");
                    Integer elementIndex1 = sc.nextInt();
                    myList.removeElementAt(elementIndex1);
                    System.out.println("All Data After remove index in Double  " + myDoubleList);
                } else {
                    System.out.println("Okay if You want to remove All Element In This Vector " +
                            "if yes press 1 or other press 2 ");
                    Integer removeAll = sc.nextInt();
                    if (removeAll == 1) {
                        myDoubleList.removeAllElements();
                        System.out.println("Your All Element Deleted Successfully here..Bay");
                        System.out.println("All Data After removeAll in Double  " + myDoubleList);
                    } else {
                        System.out.println("Okay...Samjh Gya See you......");
                    }
                }
                break;


            case "SHOW DATABASES":
                System.out.println("All Integer Value in Vector " + myList);
                System.out.println("All String Value in Vector " + myList2);
                System.out.println("All Character Value in Vector " + myCharacter);
                System.out.println("All Double Value in Vector " + myDoubleList);
                System.out.println("All Float Value in Vector " + myFloatList);
                break;

            case "SizeOfAllVector":
                System.out.println("size of Integer Value in Vector " + myList.size());
                System.out.println("size of String Value in Vector " + myList2.size());
                System.out.println("size of Character Value in Vector " + myCharacter.size());
                System.out.println("size of Double Value in Vector " + myDoubleList.size());
                System.out.println("size of Float Value in Vector " + myFloatList.size());
                break;
            case "exit" :
                System.out.println("Okay Bay Sir see you again..");
                exit(0);

            default:
                System.out.println("You will Enter wrong key here Sorry Please enter write wrapper class ...");


        }
    }while(true);
    }
}
