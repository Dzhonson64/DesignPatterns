package com.company;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        Enumeration<String> days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
        System.out.println();
        Enumeration<String> days2 = dayNames.elements();
        Iterator i = new EnumerationIterator(days2);
        while (i.hasNext()){
            System.out.println(days2.nextElement());
        }
    }
}
