package com.company;

import java.util.Iterator;

public abstract class MenuComponent {

    /* Группа "комбинационных методов - то есть методов для добавляения, удаления и получения MenuComponent"*/
    public void add(MenuComponent menuComponent){
        throw  new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw  new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i ){
        throw new UnsupportedOperationException();
    }

    /* Группа методов используемых MenuItem */
    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
