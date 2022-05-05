package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();
        System.out.println("List Status: " + (myList.isEmpty() ? "Empty" : "There is value."));
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(20);
        myList.add(50);
        myList.add(60);
        myList.add(70);

        System.out.println("List Status: " + (myList.isEmpty() ? "Empty" : "There is value."));
        System.out.println("Index : " + myList.indexOf(20));
        System.out.println("Index :" + myList.indexOf(100));
        System.out.println("Index : " + myList.lastIndexOf(20));

        Object[] array = myList.toArray();
        System.out.println("First element of array: " + array[0]);

        MyList<Integer> myList1 = myList.subList(0, 3);
        System.out.println(myList1.contains(20));
        System.out.println( myList1.contains(120));

        myList1.clear();

    }
}

