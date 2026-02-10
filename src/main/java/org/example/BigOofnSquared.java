package org.example;

public class BigOofnSquared {
    public void log(int[] numbers) {
        for (int first : numbers)  // O(n)
            for (int second : numbers)  // O(n)
                System.out.println(first + ", " + second);
    }
}
