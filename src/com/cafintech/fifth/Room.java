package com.cafintech.fifth;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exitRooms=new HashMap<>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir,Room room){
        exitRooms.put(dir,room);
    }

    public String getExitDesc(){
        StringBuffer sb=new StringBuffer();
        for (String dir:exitRooms.keySet()){
            sb.append(dir+" ");
        }
        return sb.toString();
    }

    public Room getExit(String direction){
        return exitRooms.get(direction);
    }
    @Override
    public String toString()
    {
        return description;
    }
}
