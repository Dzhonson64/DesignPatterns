package com.company;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus; // храним компонент верхнего уровня

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu() {
        Iterator iterator = allMenus.createIterator(); // Создаём итератор
        System.out.println("\nVEGETERIAN MENU\n----");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    /* У компонента есть вегитарианские блюда */
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e) {}
        }
    }
}
