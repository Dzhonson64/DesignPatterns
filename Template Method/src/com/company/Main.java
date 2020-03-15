package com.company;

public class Main {

    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee");
        coffeeWithHook.prepareRecipe();
    }
}
