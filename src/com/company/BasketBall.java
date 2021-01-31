package com.company;

public class BasketBall extends Ball{
    public boolean isNBA;
    public int capacity;

    //Properties
    public boolean isNBA() {
        if(isNBA == true) {
            return true;
        }
        else {
            return false;
        }
    }

    //Override inherited method
    public void bounce() {
       System.out.println("Basketball is Bouncing...");
    }
}
