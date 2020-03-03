package com.company;

import java.util.Observable;

import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionsDisplay(Observable observable) {
        // объект текущего состояния добовляется в качестве наблюдателя
        this.observable = observable;
        observable.addObserver(observable);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    // Метод получает Observable и необязательны пармеметры
    @Override
    public void update(java.util.Observable observable, Object o) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }
}
