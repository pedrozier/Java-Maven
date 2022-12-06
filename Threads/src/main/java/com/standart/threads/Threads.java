/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.threads;

/**
 *
 * @author zier
 */
public class Threads {

    public static void main(String[] args) {

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();

    }

    private static Runnable t1 = new Runnable() {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1: " + i);
            }
        }
    };

    private static Runnable t2 = new Runnable() {
        public void run() {
            for (int j = 0; j < 10; j++) {
                System.out.println("Thread 2: " + j);
            }
        }
    };

    private static Runnable t3 = new Runnable() {
        public void run() {
            for (int k = 0; k < 10; k++) {
                System.out.println("Thread 3: " + k);
            }
        }
    };
}
