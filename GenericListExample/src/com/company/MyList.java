package com.company;

import java.util.Arrays;

public class MyList <T> implements List<T>{

    private int size;
    private T[] myGeneric;

    public MyList(){
        this.myGeneric = (T[]) new Object[10];
    }

    public MyList(int capacity){
        this.myGeneric = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        int count = 0;
        for(T store: this.myGeneric){
            if(store != null){
                count++;
            }
        }
        return count;
    }

    @Override
    public int getCapacity() {
        return this.myGeneric.length;
    }

    @Override
    public void add(T data) {
        if((myGeneric.length - size) < 0){
            increaseSize();
        }
        else{
            myGeneric[size++] = data;
        }
    }


    private void increaseSize(){
        myGeneric = Arrays.copyOf(myGeneric, myGeneric.length*2);
        System.out.println("New length: " + myGeneric.length);
    }

    @Override
    public T get(int index) {
        if (index < size) {
            return myGeneric[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public T remove(int index) {
        T value;
        if(index >= 0 && index < size){
            value = get(index);
            for(int i = index; i < size-1; i++) {
                myGeneric[i] = myGeneric[i+1];
            }
            if(myGeneric[size-1] != null){
                myGeneric[size-1] = null;
            }
            size--;
            return value;
        }
        return null;
    }

    @Override
    public T set(int index, T data) {
        T value;
        if (index >= 0 && index < size) {
            value = get(index);
            myGeneric[index] = data;
            return value;
        }
        return null;
    }


    @Override
    public int indexOf(T data) {
        int value = -1;
        for(int i=0;i < size; i++){
            if(myGeneric[i].equals(data)){
                value = i;
                break;
            }
        }
        return value;
    }

    @Override
    public int lastIndexOf(T data) {
        int value = -1;
        for(int i= size() -1;i >= 0;i--){
            if(myGeneric[i].equals(data)){
                value = i;
                break;
            }
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOfRange(myGeneric, 0, size());
    }

    @Override
    public void clear() {
        this.myGeneric = (T[]) new Object[10];
    }

    @Override
    public MyList<T> subList(int start, int finish) {
        MyList<T> newList = new MyList<>((finish-start)+1);
        for(int i = start; i<= finish; i++){
            newList.add(myGeneric[i]);
        }
        return newList;
    }

    @Override
    public boolean contains(T data) {
        boolean value = false;
        for (int i = 0; i < size(); i++) {
            if (myGeneric[i] == data) {
                value = true;
                break;
            }
        }
        return value;
    }
}
