package com.cafintech.fifth;

/**
 * Created by 15600 on 2017/12/14.
 */
public class HandlerGo extends Handler {
    public HandlerGo(Game game) {
        super(game);
    }

    @Override
    public void doCmd(String word) {
        game.goRoom(word);
    }
}
