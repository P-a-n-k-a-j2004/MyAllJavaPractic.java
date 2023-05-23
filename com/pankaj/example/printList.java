package com.pankaj.example;



import java.util.*;


public class printList {
    public static void main(String[] args){
        MySet my=new MySet();
       // List<Integer> number=new HashAttributeSet();
/*        number.add(1);
        number.add(2);
        number.add(3);
        number.add(1);
        number.add(2);
        System.out.println(number);*/

        //here i will use a set for removing duplicate in this list

       // Set<Integer> num=new HashSet<>();

      //  Set<Integer> num=new TreeSet<>();

//        Set<Integer> num=new LinkedHashSet<> ();

        //HashAttributeSet()
//        num.addAll(number);
       // System.out.println(num.size());this is use for checking size of this array

//        num.forEach(System.out::println);
        //num.clear();for clean full screen print null
        //num.remove(1);//for delete an element in set

     //   System.out.println(num.isEmpty());





        //here i try for making a hash map using java language

/*        HashMap<String, Integer> map=new HashMap<>();
        map.put("Ashish sani", 01);
        map.put("pankaj kumar",58);
        map.put("pankaj karsaniya", 59);
        map.put("pankaj kumawat",60);
        map.put("pankaj Mishra",61);
        map.put("pankaj Tirdiya", 62);*/

//        System.out.println(map);
//        for(int i=1; i<=map.size(); i++){
//            System.out.println(i);
//            System.out.println(map);




        }
      public static class MySet {
Scanner sc=new Scanner(System.in);
      MySet(){  HashSet<String> hass=new HashSet<>();
                hass.add("Walter");
                hass.add("saul");
                hass.add("sunil");
                hass.add("pankaj");
                hass.add("Ajaypal");
          System.out.println(hass);
//                switch(int choice)

                if(hass.size()==6){
                    System.out.println("This HashSet is already full please remove an element:");
                    System.out.println("Enter the name you want to remove in this set");
                    String name=sc.nextLine();
                    hass.remove(name);
                    System.out.println(hass);
                }
                else{


                    //system.out.println(num.contains(1));this is like searching method contains search 1 is having or not in num
                }

      }
    }
}




