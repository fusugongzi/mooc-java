package com.cafintech.fifth;

/**
 * Created by 15600 on 2017/12/14.
 */
public class Test {
    public static void change(int i){
        i=10;
    }
    public static void main(String[] args) {
        int m=5;
        System.out.println(m);
        change(m);
        System.out.println(m);
    }
}
