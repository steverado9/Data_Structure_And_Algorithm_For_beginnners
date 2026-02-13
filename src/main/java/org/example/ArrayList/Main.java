package org.example.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(3);
        System.out.println("list.indexOf(20): " + list.indexOf(20));
        System.out.println(list);
    }
}
