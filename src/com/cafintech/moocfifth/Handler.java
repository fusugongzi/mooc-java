package com.cafintech.moocfifth;

/**
 * Created by 15600 on 2017/12/14.
 */
public class Handler {
    protected Game game;

    public Handler(Game game) {
        this.game = game;
    }

    public boolean isBye(){return false;}
    public void doCmd(String word){}
}
