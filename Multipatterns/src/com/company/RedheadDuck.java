package com.company;

public class RedheadDuck implements Quackable {
    Observable observable;
    @Override
    public void registerObserverver(Observer observer) {
        observable.registerObserverver(observer);
    }

    @Override
    public String toString() {
        return "RedheadDuck";
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
