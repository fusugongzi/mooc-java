package com.cafintech.moocfourth;

/**
 * Created by 15600 on 2017/12/14.
 */
public class Mp3 extends Item {
    private int capacity;


    public Mp3(String title, int playingTime, boolean gotIt, String comment,int capacity) {
        super(title, playingTime, gotIt, comment);
        this.capacity=capacity;
    }

    @Override
    public void print() {
        System.out.print("Mp3");
        super.print();
    }
}
