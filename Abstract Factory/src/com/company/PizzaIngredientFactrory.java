package com.company;

public interface PizzaIngredientFactrory {
    // для каждого ингредиента определяется свой метод
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
