package com.prectice.udemy.Exercise;

public class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        if(inches<0){
            this.feet=-1;
            this.inches=-1;
        }
        else{
            this.feet=inches/12;
            this.inches=inches%12;
        }
        // Store the feet and inches in their respective instance variables.

    }

    public int getFeet() {
        // TODO: Return the value of feet.

        return feet;
    }

    public int getInches() {
        // TODO: Return the value of inches.
        return inches;
    }

    public static void main(String[] args) {
        Dimension dimension=new Dimension(25);
        System.out.println("Feet: "+dimension.getFeet());
        System.out.println("Inches: "+dimension.getInches());
    }
}
