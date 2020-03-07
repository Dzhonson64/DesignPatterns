package com.company;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactrory ingredientFactrory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactrory);
            pizza.setName("New York Style Cheese Pizza");
        } /*else if (item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactrory);
            pizza.setName("New York Style Veggie Pizza");
        }else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactrory);
            pizza.setName("New York Style Clam Pizza");
        }else if (item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactrory);
            pizza.setName("New York Style Pepperoni Pizza");
        }*/
        return pizza;
    }

}
