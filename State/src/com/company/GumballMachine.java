package com.company;

import java.util.regex.Pattern;

public class GumballMachine {

    /* Все возможные состояни */
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    State state = soldOutState; // переменная для хранения State
    int count = 0; // кол-во хранимых шариков

    // Получаем исходное количество шариков
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if(numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense(); // это внутренний метод и пользователь не может потребовать явного вызова, поэтому нет реализации
    }

    // переводит в другое сосотояние
    void setState(State state){
        this.state = state;
    }

    // Вспомогательный метод опускает шарик и уменьшает их кол-во
    void reliaseBall(){
        System.out.println("A gumball comes rolling out the slot ...");
        if(count != 0){
            count = count - 1;
        }
    }

    public State getNoQuarterState(){
        return state;
    }

    public int getCount(){
        return count;
    }

    public State getSoldOutState(){
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
}
