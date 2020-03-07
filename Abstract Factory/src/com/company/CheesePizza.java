package com.company;

public class CheesePizza extends Pizza {
    PizzaIngredientFactrory ingredientFactrory;

    public CheesePizza(PizzaIngredientFactrory ingredientFactrory) {
        this.ingredientFactrory = ingredientFactrory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactrory.createDough();
        sauce = ingredientFactrory.createSauce();
        cheese = ingredientFactrory.createCheese();
    }
}
