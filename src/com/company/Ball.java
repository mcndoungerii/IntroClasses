package com.company;

public class Ball {

    //All these below are the children of a class

    //Properties or Instance variables
    private String color;
    private String name;
    private int capacity;
    private int bounceRate;

    // Default Constructor - Helpful to not get errors in Inherited Class with no Constructor defined.
    public Ball() {

    }

    // Main Constructor
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

    //Getters and Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }
}
