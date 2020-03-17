package com.company;


import java.util.ArrayList;
import java.util.List;

public class PancakeHouseIterator implements Iterator {
    List<MenuItem> items;

    public PancakeHouseIterator(){
        items = new ArrayList<MenuItem>();
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
