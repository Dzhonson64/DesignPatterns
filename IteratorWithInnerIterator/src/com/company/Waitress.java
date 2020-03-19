package com.company;

import java.util.Iterator;

public class Waitress{
    Menu dinnerMenu;

    public Waitress(Menu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    // Создаёт инетераторы меню и вызывает перегруженные методы printMenu()
    public void printMenu(){
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\nLUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
