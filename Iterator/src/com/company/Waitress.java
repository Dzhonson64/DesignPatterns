package com.company;

public class Waitress {
    DinerMenu dinerMenu;

    public Waitress(DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    // Создаёт инетераторы меню и вызывает перегруженные методы printMenu()
    public void printMenu(){
        Iterator dinnerIterator = dinerMenu.crteateIterator();
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
