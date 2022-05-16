package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int capacity = 100;
        List<Integer> arrayList = new ArrayList<>(capacity);
        for(int i=0;i<=capacity;i++){
            arrayList.add(i);
        }

        List<Integer> subArray1 = arrayList.subList(0, capacity/4);
        List<Integer> subArray2 = arrayList.subList(capacity/4, capacity/2);
        List<Integer> subArray3 = arrayList.subList(capacity/2, capacity/4*3);
        List<Integer> subArray4 = arrayList.subList(capacity/4*3, capacity);


        ThreadRace threadRace1 = new ThreadRace(subArray1);
        threadRace1.start();
        ThreadRace threadRace2 = new ThreadRace(subArray2);
        threadRace2.start();
        ThreadRace threadRace3 = new ThreadRace(subArray3);
        threadRace3.start();
        ThreadRace threadRace4 = new ThreadRace(subArray4);
        threadRace4.start();
    }
}
