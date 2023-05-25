package com.atamertc.aksam.b_01_singleton.enums;

public class EvHalki extends Thread {

    @Override
    public void run() {
        robotCagir();
    }

    public void robotCagir() {
        Robot.ROBOT.calis();
    }
}
