package com.company;

public class Ball {

    //All these below are the children of a class

    //Properties or Instance variables
    private String color;
    private String name;
    private int capacity;
    private int bounceRate;

    public Ball(String mColor, String mName, int mCapacity, int mBounceRate) {
        color = mColor;
        name = mName;
        capacity = mCapacity;
        bounceRate = mBounceRate;
    }

    //Behaviours
    public String bounce() {

        return "Bouncing ...";
    }
    public void inflates() {
        System.out.println("Inflating ...");
    }

    public void deflates() {
        System.out.println("Deflating ...");
    }

    public void showColor() {
        System.out.println(color);
    }

    public void showName() {
        System.out.println(name);
    }
}
