package org.example;

public class BigOofOne {
    static void log(int[] numbers) {
        System.out.println(numbers[0]); //this operation runs at constant time
        System.out.println(numbers[0]);
    }
}
