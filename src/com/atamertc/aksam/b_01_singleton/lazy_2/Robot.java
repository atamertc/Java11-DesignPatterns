package com.atamertc.aksam.b_01_singleton.lazy_2;

/*
1 tane robotumuz var bu robotumuz calis metodu var
calis metoduna hashcode --> numarali robot calisiyor
2- EvHalki sinifimiz olacak bu sinifta robot cagir metodumuz olacak
bu metot calisinca bize robottaki calis metodunu calistiracak
3- Test sinifinda 3 tane ev halki yaratip ayni anda robotu cagirmaya
calissinlar ev halki sinifimiz thread olacak
 */
public class Robot {
    private static Robot instance;
    private Robot() {

    }

    public synchronized static Robot getInstance() {
        if (instance == null) {
            return instance = new Robot();
        }
        return instance;
    }

    public void calis() {
        System.out.println(hashCode()+" --> numarali robot calisiyor");
    }
}
