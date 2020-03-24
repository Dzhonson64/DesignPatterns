package com.company;

public class Quacklogist implements Observer {

    /* Выводит инфоромацию о реализации Quackable, от которой поступило оповещение */
    public void update(QuackObservable duck) {
        System.out.println("Quacklogist: " + duck + " just quacked");
    }
}
