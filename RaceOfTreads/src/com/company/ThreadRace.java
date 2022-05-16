package com.company;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace extends Thread{

    private List<Integer> evenNumbers = new ArrayList<>();
    private List<Integer> oddNumbers = new ArrayList<>();
    List<Integer> subArray;
    int number;

    public ThreadRace(List<Integer> subArray){
        this.subArray = subArray;
    }

    @Override
    public void run(){
        evenOrOdd(this.subArray);
        print();
    }

    public synchronized void evenOrOdd(List<Integer> subArray){
        int capacity = subArray.size();
        for(int i=0;i<capacity;i++){
            number = subArray.get(i);
            if(number % 2 == 0){
                evenNumbers.add(number);
            }else{
                oddNumbers.add(number);
            }
        }
    }

    public synchronized void print(){
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }

}
