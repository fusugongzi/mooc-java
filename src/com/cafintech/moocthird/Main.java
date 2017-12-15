package com.cafintech.moocthird;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 15600 on 2017/12/13.
 */


public class Main {
    public static void main(String[] args) {
        ArrayList<String> citynames=new ArrayList<String>();
        Lc lc=new Lc();
        Scanner scanner=new Scanner(System.in);
        String line1=scanner.nextLine();
        String[] cityname=line1.split("\\s{1,}");
        for(String s:cityname){
            if(!s.equals("###")){
                citynames.add(s);
            }
        }
        for(int i=0;i<citynames.size();i++){
            String line=scanner.nextLine();
            String[] dis=line.split("\\s{1,}");
            for(int j=0;j<dis.length;j++){
                String from=citynames.get(i);
                String to=citynames.get(j);
                String city=from+"."+to;
                int distance=Integer.parseInt(dis[j]);
                lc.add(city,distance);
            }
        }

        String line2=scanner.nextLine();
        String []tmp=line2.split("\\s{1,}");
        System.out.println(lc.getDistance(tmp[0]+"."+tmp[1]));

    }
}

class Lc{
    private HashMap<String,Integer> distance=new HashMap<String,Integer>();

    public void add(String city,int dis){
        distance.put(city,dis);
    }

    public int getDistance(String city){
        return distance.get(city);
    }

    public HashMap<String,Integer> getHashMap(){
        return this.distance;
    }
}

