package com.company;

/* Реализуем декоратор для подсчёта уток */
public class QuackCounter implements Quackable {
    Quackable duck;
    Observable observable;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.observable = new Observable(this);
        this.duck = duck;
    }

    @Override
    public String toString() {
        return duck.toString();
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        observable.notifyObservers();
    }

    public static int getQuacks(){
        return numberOfQuacks;
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
