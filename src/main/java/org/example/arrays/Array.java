package org.example.arrays;

import java.util.ArrayList;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        //if the array is full, resize it
        if (this.items.length == count) {
            int[] newItems = new int[count * 2];
            //copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = this.items[i];
            }
            //set 'items' to this new array
            this.items = newItems;
        }
        //add the item into the array of items
        this.items[count++] = item;
    }

    public void removeAt(int index) {
        //validate the index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        //shift the items to the left to fill the hole
        for (int i = index; i < count; i++) {
            this.items[i] = this.items[i + 1];
        }
        //decrease count, cos count is the total element in the array
        count--;
    }

    public int indexOf(int item) {
        //loop through the elements of the items
        //if we find it, return index
        //otherwise return -1
        for (int i = 0; i < count; i++) {
            if (this.items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(this.items[i]);
        }
    }
}
