package com.cafintech.moocfourth;

/**
 * Created by 15600 on 2017/12/13.
 */
public class CD extends Item{
    private String artist;
    private int numofTracks;

    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title,playingTime,false,comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
    }

    public void print(){
        System.out.print("CD:");
        super.print();
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        CD tmp=(CD) obj;
        return this.artist.equals(tmp.artist);
    }

    public static void main(String[] args) {
        CD cd=new CD("abc", "abc", 4, 5, "aaa");
        CD cd1=new CD("abc", "abc", 4, 5, "aaa");
//        System.out.println(cd.toString());
        System.out.println(cd.equals(cd1));
    }
}
