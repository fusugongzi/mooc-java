package com.cafintech.moocfourth;

/**
 * Created by 15600 on 2017/12/14.
 */
public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt=false;
    private String comment;

    public Item(String title, int playingTime, boolean gotIt, String comment) {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void print() {
        System.out.print(this.title);
    }
}
