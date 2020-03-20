package com.company;
// Класс отвечающий за состояние "Нет монетки"

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    // Передаём конструктору объект автомата, которая просто сохраняется в переменной экземаляра
    public NoQuarterState(GumballMachine gumballaMachine) {
        this.gumballMachine = gumballaMachine;
    }


    // Переход в состояние "Есть монетка"
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a qurter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }


    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quater");
    }


    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
