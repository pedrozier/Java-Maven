/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.threads3;

/**
 *
 * @author zier
 */
public class Test {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1", 400);
        MyThread t2 = new MyThread("t2", 500);

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.suspend();

        t1.resume();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.resume();

        t2.stop();

    }
}
