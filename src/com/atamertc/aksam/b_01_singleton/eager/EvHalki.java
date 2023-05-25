package com.atamertc.aksam.b_01_singleton.eager;

public class EvHalki extends Thread {

    @Override
    public void run() {
        robotCagir();
    }

    public void robotCagir() {
        Robot.getInstance().calis();
    }
}
