package com.company;

public class ChicagoPizzaStore extends PizzaStore{
    Pizza createPizza(String item){
        if (item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } /* Дальше можно ещё своё придумывать
        else if (item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if (item.equals("peperoni")){
            return new NYStylePeperoniPizza();
        }*/
        else return null;
    }
}
