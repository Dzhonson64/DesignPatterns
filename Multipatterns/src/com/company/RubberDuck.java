package com.company;

public class RubberDuck implements Quackable {
    Observable observable;
    @Override
    public void quack() {
        System.out.println("Squeak"); // Резиновая утка пизит вместо того, чтобы нормально крякать
    }

    @Override
    public void registerObserverver(Observer observer) {
        observable.registerObserverver(observer);
    }


    @Override
    public String toString() {
        return "RubberDuck";
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
