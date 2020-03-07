package com.company;

public class NyPizzaStore extends PizzaStore {
    public NyPizzaStore() {

    }

    // Создаются конкретные классы. Для каждого типа пиццы мы создаём реалищацию в нью-йорском стиле.
    // Метод orderPizza() суперкласса понятия не имеет, какой из типов пиццы мы создаём; он знает лишь то, что пиццу можно приготовить, выпечь, нарезать и упаковать
    Pizza createPizza(String item){
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        } /*else if (item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if (item.equals("peperoni")){
            return new NYStylePeperoniPizza();
        }*/
        else return null;
    }
}
