package com.cafintech.moocfirst;

/**
 * Created by 15600 on 2017/12/11.
 */
public class Test {
    //计算a和b的最大公约数
    static int gcd(int a,int b){
        return b>0?gcd(b,a%b):a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(3,4));
    }

}
