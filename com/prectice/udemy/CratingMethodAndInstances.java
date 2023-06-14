package com.prectice.udemy;



public class CratingMethodAndInstances {
    public static void main(String [] args){
        Book artOfComputerProgramming=new Book("This is Art Of Computer Programming Book.");
        Book effectiveJava=new Book("This is My Effective Java Book.");
        Book cleanCode=new Book("This is My Clean Code Book.");
   System.out.println(artOfComputerProgramming.getBooks());
   System.out.println(effectiveJava.getBooks());
   System.out.println(cleanCode.getBooks());
    }
}
class Book{
    String books;
    Book(String book){
        this.books=book;

    }
    public String getBooks(){
        return books;
    }

}