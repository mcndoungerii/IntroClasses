package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Ball myBall = new Ball("Blue","Ally",20,300);

    //accessing Setters
    myBall.setName("Adidas");
    myBall.setBounceRate(20);

    //accessing Getters
    System.out.println(myBall.getName());
    System.out.println(myBall.getBounceRate());
    }
}
