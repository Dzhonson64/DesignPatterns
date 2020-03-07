package com.company;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type); // Фабричный метод теперь абстрактный и вся ответсвенность экземпляров Pizza перемещена в метод, действующий укак фабрика
}
