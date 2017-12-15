package com.cafintech.moocfourth;

import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * Created by 15600 on 2017/12/13.
 */
public class Database {
//    private ArrayList<CD> listCD=new ArrayList<>();
//    private ArrayList<DVD> listDVD=new ArrayList<>();
    private ArrayList<Item> listItem=new ArrayList<Item>();

    public void print(){
//        for(CD cd:listCD){
//            cd.print();
//        }
//        for(DVD dvd:listDVD){
//            dvd.print();
//        }
        for(Item item:listItem){
            item.print();
            System.out.println();
        }
    }

//    public void add(CD cd){
//        this.listCD.add(cd);
//    }
//
//    public void add(DVD dvd){
//        this.listDVD.add(dvd);
//    }
    public void add(Item item){
        listItem.add(item);
    }

    public static void main(String[] args) {
        CD cd=new CD("abc", "abc", 4, 5, "aaa");
        CD cd1=new CD("bcd", "bcd", 4, 5, "addd");
        DVD dvd=new DVD("xxx","wzz",1,"good");
        Mp3 mp3=new Mp3("sss",10,false,"wzz",25);
        Database database=new Database();
        database.add(cd);
        database.add(cd1);
        database.add(dvd);
        database.add(mp3);
        database.print();
    }
}
