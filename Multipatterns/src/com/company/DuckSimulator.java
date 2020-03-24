package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DuckSimulator {

    public static void main(String[] args) {
	    DuckSimulator simulator = new DuckSimulator();
	    AbstractDuckFactory duckFactory = new CountingDuckFactory();
	    simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        /* Создаём по экземпяру для каждой реализации Quackable */
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose()); // маскируем Goose под Duck

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flonk flockOfDucks = new Flonk(); // создаём стаю через композицию

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flonk flockOfMallards = new Flonk(); // создаём стаю через композицию

        /* Создаём по экземпяру для каждой реализации Quackable */
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards); // одну стаю добавляем к "основной" стаи
        System.out.println("\nDuck Simulator: With Observer");
        Quacklogist quacklogist = new Quacklogist();
        flockOfDucks.registerObserverver(quacklogist);
        simulate(flockOfDucks);
        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
        /* Запускаем имитацию */
        System.out.println("\nDuck Simulator: Whole Flock Simulaton");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
