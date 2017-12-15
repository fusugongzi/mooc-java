package com.cafintech.moocthird;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 15600 on 2017/12/13.
 */
class V{
    private int i=0;

    public V(int i){
        this.i=i;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        scanner.nextLine();
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        System.out.println("m is "+m);
        System.out.println("s1 is "+s1);
        System.out.println("s2 is "+s2);
    }
}
