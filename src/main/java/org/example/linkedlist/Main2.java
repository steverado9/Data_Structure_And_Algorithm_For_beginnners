package org.example.linkedlist;

public class Main2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(50);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(50));
    }
}
