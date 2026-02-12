package org.example.arrays;

import java.util.ArrayList;

public class Array {
    private ArrayList array;

    public Array(int length) {
        this.array = new ArrayList();
    }

    public void insert(int item) {
        this.array.add(item);
    }

    public void indexOf(int index) {
        System.out.println(this.array.indexOf(index));;
    }

    public void removeAt(int index) {
        this.array.remove(index);
    }

    public void print() {
        for (Object i : this.array) {
            System.out.println(i);
        }
    }
}
