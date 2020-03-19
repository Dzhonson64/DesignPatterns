package com.company;

import java.util.Iterator;

public class DinnerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(MenuItem item){
        if(numberOfItems < menuItems.length && menuItems[numberOfItems] != null){
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }
    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
