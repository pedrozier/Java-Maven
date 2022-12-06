/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.threads;
/**
 *
 * @author zier
 */
public class Test {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        MyThread t1 = new MyThread("t1", nums, 300);
        MyThread t2 = new MyThread("t2", nums, 500);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        try {
            thread1.join(0);
            thread2.join(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all tasks finished");
    }
}
