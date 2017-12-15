package com.cafintech.moocsecond;

/**
 * Created by 15600 on 2017/12/12.
 * second week homework
 */
class Display{
    private int value=0;
    private int limit=0;

    Display(int limit){
        this.limit=limit;
    }

    public void increase(){
        value++;
        if(value==limit){
            value=0;
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Clock{
    Display hour=new Display(24);//钟表小时部分
    Display minute=new Display(60);//钟表分钟部分
    Display second=new Display(60);//时钟的秒部分

    public Clock(int hour,int minute, int second){
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    }

    public void tick(){
        this.second.increase();
        if(this.second.getValue()==0){
            this.minute.increase();
            if(this.minute.getValue()==0){
                this.hour.increase();
            }
        }
    }

    public void start(){
        minute.increase();
        if(minute.getValue()==0){
            hour.increase();
        }//在钟表类的实现里，实现分钟增加到60时小时加1
    }

    public Display getHour() {
        return hour;
    }

    public Display getMinute(){
        return minute;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
    }
}

public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        clock.tick();
        System.out.println(clock);
        in.close();
    }

}
