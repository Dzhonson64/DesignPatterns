package com.company;

/* Адаптируем Quackbale, чтобы Goose также могла вызываться вместе с Duck */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
