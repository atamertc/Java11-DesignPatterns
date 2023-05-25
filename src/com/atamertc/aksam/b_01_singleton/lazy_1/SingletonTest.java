package com.atamertc.aksam.b_01_singleton.lazy_1;

public class SingletonTest {

    public static void main(String[] args) {

        MyPostgreConnection myPostgreConnection = MyPostgreConnection.getINSTANCE();
        System.out.println(myPostgreConnection);
    }
}
