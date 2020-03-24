package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Реализация стаи уток с помощью Компоновщика */
public class Flonk implements Quackable{
    List<Quackable> quackers = new ArrayList<>();
    Observable observable;

    @Override
    public void registerObserverver(Observer observer) {
        for (Quackable  quacker : quackers){
            quacker.registerObserverver(observer);
        }
    }


    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable  quacker : quackers){
            quacker.quack();
        }
    }
}
