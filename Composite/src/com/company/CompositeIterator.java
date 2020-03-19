package com.company;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack<>();

    // Передаём итератор верхнего уровня
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }else {
            Iterator iterator = stack.peek(); // читаем из стека итератор
            if(!iterator.hasNext()){
                /* Нет следующего элемента */
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object next() {
        if (hasNext()){
            /* Следующий элемент существует */
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next(); // извлекаем следующий элемент
            if(component instanceof Menu){
                /* Обнаружена "комбинация", которую необходимо включить в перебор */
                stack.push(((Menu) component).createIterator());
            }
            return component;
        } else{
            return null;
        }
    }
}
