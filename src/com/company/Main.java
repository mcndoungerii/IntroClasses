package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Ball myBall = new Ball("Blue","Ally",20,300);

    Ball myFog = new Ball("Adidas","Air");

    Ball myCount = new Ball("Nike","Jordan", 20000);

    myFog.setColor("Red");
    myFog.setColor("Adidas");

    myCount.setColor("Black");
    myCount.setName("Nike");
    myCount.setCapacity(5000);

    //accessing Setters
    myBall.setName("Adidas");
    myBall.setBounceRate(20);

    //accessing Getters
    System.out.println(myBall.getName());
    System.out.println(myBall.getBounceRate());
    System.out.println(myFog.getName() + " " + myFog.getColor() + " is a cool thing that i like.");
    System.out.println(myCount.getColor() + " "+ myCount.getName() + " Rubber cost almost" + myCount.getCapacity() +" Ksh.");
    }
}
