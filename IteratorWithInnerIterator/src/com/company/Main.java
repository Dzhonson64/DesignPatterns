package com.company;

public class Main {

    public static void main(String[] args) {
        DinnerMenu dinerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();
    }
}
