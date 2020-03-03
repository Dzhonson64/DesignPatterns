package com.company;

import java.util.ArrayList;

public class WeatherData implements Subject{
    public WeatherData() {
        observers = new ArrayList<>();
    }

    private ArrayList<Observer> observers; // наблюдатели
    private float temperature;
    private float humidity;
    private float pressure;

    // Добавление новых наблюдателей
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Удаление наблюдателей
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }


    // Оповещение наблюдателей
    @Override
    public void notifyObservers() {
        for(Observer i: observers){
            i.update(temperature, humidity, pressure);
        }
    }

    // Оповещение наблюдателей о повялении новых данных
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

