package com.cafintech.moocfirst;

/**
 * Created by 15600 on 2017/12/11.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

}

class Fraction{
    int fz;
    int fm;

    Fraction(int a,int b){
        this.fz=a;
        this.fm=b;
    }

    double toDouble(){
        return this.fz/this.fm;
    }

    Fraction plus(Fraction r){
        return new Fraction(this.fz*r.fm+this.fm*r.fz,this.fm*r.fm);
    }

    Fraction multiply(Fraction r){
        return new Fraction(this.fz*r.fz,this.fm*r.fm);
    }

    void print(){
        int gy=gcd(fz,fm);
        if(gy==fm){
            System.out.println(fz/fm);
        }else {
            System.out.println(fz/gy+"/"+fm/gy);
        }
    }

    //计算a和b的最大公约数
    int gcd(int a,int b){
        return b>0?gcd(b,a%b):a;
    }


}
