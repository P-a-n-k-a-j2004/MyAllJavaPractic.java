package com.prectice.udemy.Exercise;

public class CalculatingSquareOfAnSide {


        private int side;

        public CalculatingSquareOfAnSide(int side) {
            this.side=side;
        }

        public int calculateArea() {
            // TODO: Calculate and return the area of the square
            if(side<=0){
                // if side is non-positive, return -1

                return -1;
            }
            return side*side;
        }

        public int calculatePerimeter() {
            // TODO: Calculate and return the perimeter of the square
            //this exercise is cool and easy
            if(side<=0){
                //if side is non-positive, return -1

                return -1;
            }
            return 4*side;
        }

    public static void main(String[] args) {
        CalculatingSquareOfAnSide calculatingSquareOfAnSide=new CalculatingSquareOfAnSide(5);
        System.out.println("Calculating Area: "+calculatingSquareOfAnSide.calculateArea());
        System.out.println("Calculating Perimeter: "+calculatingSquareOfAnSide.calculatePerimeter());
    }


}
