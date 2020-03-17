package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();
    }
}
