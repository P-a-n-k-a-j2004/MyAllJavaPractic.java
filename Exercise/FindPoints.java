package com.prectice.udemy.Exercise;

import java.awt.*;

public class FindPoints {
    // Defining a Point class to represent a point in 2-dimensional space


        // x-coordinate of the point
        private int x;

        // y-coordinate of the point
        private int y;

        // Constructor for the Point class
        public FindPoints(int x, int y) {
            this.x = x;  // Assigning x-coordinate of the point
            this.y = y;  // Assigning y-coordinate of the point
        }

        // Method to get the x-coordinate of the point
        public int getX() {
            return x;
        }

        // Method to get the y-coordinate of the point
        public int getY() {
            return y;
        }

        // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
        public void move(int dx, int dy) {

            x+=dx;
            y+=dy;


        }

        // TODO: Implement the method to calculate the distance from this point to another point
        public double distanceTo(Point other) {
            int diffx=this.x-other.x;
            int diffy=this.y-other.y;
            return Math.sqrt(diffx*diffx+diffy*diffy);

        }

    public static void main(String[] args) {
        FindPoints findPoints=new FindPoints(3,6);
       // System.out.println("move Method: " + (findPoints.move(1,2)));
        System.out.println(findPoints.getX());
        System.out.println(findPoints.getY());
      //  System.out.println(findPoints.move(1,2));
        //System.out.println(findPoints.distanceTo(new Point(4,8)));
    }
    }

