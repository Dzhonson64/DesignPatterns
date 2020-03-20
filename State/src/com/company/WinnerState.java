package com.company;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No insertQuarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No insertQuarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("No insertQuarter!");
    }

    @Override
    public void dispense() {
        System.out.println("You're a winner! You get two gumballs for your quarter");
        gumballMachine.reliaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.reliaseBall();
            if(gumballMachine.getCount() > 0){
                // В автомате есть 2-ой шарик, то выдаём
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }else{
                System.out.println("Ooops. out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
