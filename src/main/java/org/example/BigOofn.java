package org.example;

public class BigOofn {
    public void log(int[] numbers) {

        for (int number : numbers) { //O(n)
            System.out.println(number);
        }
    }
}
