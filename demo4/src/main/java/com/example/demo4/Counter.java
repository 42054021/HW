package com.example.demo4;

public class Counter {
    private static int count;
    public static int getCount() {
        count++;
        return count;
    }
}