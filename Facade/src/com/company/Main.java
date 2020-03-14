package com.company;

public class Main {

    public static void main(String[] args) {
        // Создание экземпляров компонентов

        // Создаём фасад со всеми компонентами подсистемы
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        // Упрощённый интерфейс используется для запуска и для прекращения просмотра
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
