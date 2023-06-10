package com.standard.junitthreadtest;

public class SequentialCounter {

    private static SequentialCounter instance;
    private static int value;
    private static Object lock = new Object();

    public static SequentialCounter getInstance() {
        SequentialCounter counter = instance;
        if (counter == null) {
            synchronized (lock) {
                counter = instance;
                if (counter == null) {
                    instance = counter = new SequentialCounter();
                }
            }
        }
        return instance;
    }

    public synchronized int next() {
        return value++;
    }

}