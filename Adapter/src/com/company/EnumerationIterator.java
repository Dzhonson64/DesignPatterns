package com.company;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    Enumeration enumer;

    public EnumerationIterator(Enumeration enumer) {
        this.enumer = enumer;
    }

    @Override
    public boolean hasNext() {
        return enumer.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumer.nextElement();
    }

    // Так как поддерживать этот метод интерфейс Iterator не удастся, поэтому мы просто инициируем исключение
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
