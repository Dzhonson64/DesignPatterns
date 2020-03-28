package com.company;

public interface BeatModeInterface {
    /* Методы для управления моделью наосновании действий пользователя */
    void initialize();
    void on();
    void off();
    void setBPM(int bpm); // установка частоты ритма
    int getBPM();

    /*  Методы, при помощи которых представление и контроллер получают информацию состояния и изменяют статут наблюдателя */
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);

}
