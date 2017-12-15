//package com.cafintech.moocsecond;
//
///**
// * Created by 15600 on 2017/12/12.
// *钟表类
// */
//public class Clock {
//    Display hour=new Display(24);//钟表小时部分
//    Display minute=new Display(60);//钟表分钟部分
//
//    public void start(){
//        minute.increase();
//        if(minute.getValue()==0){
//            hour.increase();
//        }//在钟表类的实现里，实现分钟增加到60时小时加1
//    }
//
//    public Display getHour() {
//        return hour;
//    }
//
//    public Display getMinute(){
//        return minute;
//    }
//
//    public static void main(String[] args) {
//        Clock clock=new Clock();
//        while (true){
//            clock.start();
//            System.out.printf("%02d:%0                                                                                                              2d\n",clock.getHour().getValue(),clock.getMinute().getValue());
//        }
//    }
//}
