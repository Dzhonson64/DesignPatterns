package com.company;

/* Чтобы интегрировать Quackable с Observable нужно, чтобы классы Quackable содержали комбинированные объеты Observable и умели делегировать им операции  */
public class MallarDuck implements Quackable {
    Observable observable;

    public MallarDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void registerObserverver(Observer observer) {
        observable.registerObserverver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "MallarDuck";
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        observable.notifyObservers();
    }
}
