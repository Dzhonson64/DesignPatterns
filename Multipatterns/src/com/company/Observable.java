package com.company;

import java.util.ArrayList;
import java.util.List;

/* Реализует всю функциональность, необходимую Quackable для наблюдения */
public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    /* Передаём объект QuackObservable, которые используется им для управления наблюдением, чтобы наблюдатель знал в каком объекте произошло событие */
    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserverver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(duck);
        }
    }
}
