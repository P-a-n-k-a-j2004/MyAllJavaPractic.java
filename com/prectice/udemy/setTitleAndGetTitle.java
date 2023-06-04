package com.prectice.udemy;

public class setTitleAndGetTitle {
    public String title;

    public String setTitle(String myTitle){
       title=myTitle;
         return title;

    }
    public String getTitle(){

        return title;
    }

    public static void main(String [] args){
        setTitleAndGetTitle myTitle=new setTitleAndGetTitle();
        myTitle.setTitle("I am pankaj Tirdiya");
        setTitleAndGetTitle second = new setTitleAndGetTitle();
        second.setTitle("This is my second title..");

        System.out.println(myTitle.getTitle());
        System.out.println(second.getTitle());
    }
}
