package com.company;

public interface State {

    // вставка монетку
    public void insertQuarter();

    // вовзрат монетки
    public void ejectQuarter();

    // Дрёнуть за  рычаг
    public void turnCrank();

    // Выдать шарик
    public void dispense();
}
