package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(MenuItem item){
        if(numberOfItems < menuItems.length && menuItems[numberOfItems] != null){
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public Iterator crteateIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
