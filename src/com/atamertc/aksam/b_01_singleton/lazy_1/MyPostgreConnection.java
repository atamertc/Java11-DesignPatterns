package com.atamertc.aksam.b_01_singleton.lazy_1;

public class MyPostgreConnection {

    private static MyPostgreConnection instance;
    private MyPostgreConnection () {

    }
    public static MyPostgreConnection getINSTANCE() {
        if (instance == null) {
            return instance = new MyPostgreConnection();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "hashCode()=" + hashCode();
    }


}
