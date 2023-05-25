package com.atamertc.aksam.b_01_singleton.lazy_2;

public class EvHalki extends Thread {

    @Override
    public void run() {
        robotCagir();
    }

    public void robotCagir() {
        Robot.getInstance().calis();
    }
}
