package com.cafintech.moocfifth;

/**
 * Created by 15600 on 2017/12/14.
 */
public class HandlerBye extends Handler {
    public HandlerBye(Game game) {
        super(game);
    }

    @Override
    public boolean isBye() {
        return true;
    }
}
