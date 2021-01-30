package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ball myBall = new Ball();
        Ball secondBall = new Ball();

        //myBall
        myBall.color = "Red";
        myBall.name = "Mazda";

        System.out.println("I'm with a " + myBall.color + " " + myBall.name);

        //secondBall
        secondBall.color = "Blue";
        secondBall.name = "T-Shirt";

        System.out.println("I wore a " + secondBall.color + " " + secondBall.name);
    }
}
