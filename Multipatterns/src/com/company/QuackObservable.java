package com.company;

/* Чтобы за  Quackable можно было наблюдать, они должны реализовать интрефейс */
public interface QuackObservable {
    public void registerObserverver(Observer observer); // Метод регистрации набладателей

    public void notifyObservers(); // метод оповещения наблюдателей
}
