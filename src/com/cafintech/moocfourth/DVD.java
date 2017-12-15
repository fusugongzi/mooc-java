package com.cafintech.moocfourth;

/**
 * Created by 15600 on 2017/12/13.
 */
public class DVD extends Item{
    private String director;

    public DVD(String title, String director, int playingTime, String comment) {
        super(title,playingTime,false,comment);
        this.director = director;
    }

    public void print(){
        System.out.print("DVD:");
        super.print();
    }
}
