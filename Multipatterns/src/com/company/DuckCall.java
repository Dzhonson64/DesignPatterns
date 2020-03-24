package com.company;

public class DuckCall implements Quackable {
    Observable observable;


    @Override
    public String toString() {
        return "DuckCall";
    }

    @Override
    public void quack() {
        System.out.println("Kwak"); // Звук утинного манка несколько отличается откряканья настоящей утки
    }

    @Override
    public void registerObserverver(Observer observer) {
        observable.registerObserverver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
