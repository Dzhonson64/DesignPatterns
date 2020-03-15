package com.company;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }


    }
    abstract void brew();
    abstract void addCondiments();
    void boidWater(){
        System.out.println("Boiling water");
    }

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    // Метод-перехватчик: субкласс может преопредлить этот метод, но не обязан этого делать
    boolean customerWantsCondiments(){
        return true;
    }
}
