package com.cafintech.moocthird;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by 15600 on 2017/12/12.
 * 记事本的实现
 */
class Value{
    private int i;
    public void set(int i){this.i=i;}
    public int get(){return i;}
    public String toString(){return ""+i;}
}
public class NoteBook {
    ArrayList<String> notes=new ArrayList<>();

    public void add(String s){
        notes.add(s);
    }

    public void add(String s,int location){
        notes.add(location,s);
    }

    public int getSize(){
        return notes.size();
    }

    public String getNote(int index){
        return notes.get(index);
    }

    public void removeNote(int index){
        notes.remove(index);
    }

    public String[] list(){
        String []a=new String[getSize()];
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
//        HashSet<String> s=new HashSet<String>();
//        s.add("second");
//        s.add("first");
//        System.out.println(s);

//        ArrayList<String> list=new ArrayList<String>();
//        list.add("first");
//        list.add("second");
//        list.add("first");
//        System.out.println(list);
        Value v=new Value();
        v.set(10);
        System.out.println(v);


//        int []ia=new int[10];
//        String []a=new String[10];
//        for(int i=0;i<ia.length;i++){
//            ia[i]=i;
//        }
//        for(int k: ia){
//            System.out.println(k);
//            k++;
//        }
//        for(int k:ia){
//            System.out.println(k);
//        }
//        NoteBook noteBook=new NoteBook();
//        noteBook.add("first");
//        noteBook.add("second");
//        noteBook.add("third",1);
//        String []a=noteBook.list();
//        for(String s:a){
//            System.out.println(s);
//        }
    }
}
