/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.threads3;

/**
 *
 * @author zier
 */
public class MyThread implements Runnable {

    private String name;
    private int time = 0;
    private boolean isSuspend;
    private boolean isFinished;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
        isSuspend = false;
        isFinished = false;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println("running " + this.name);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.name + " " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (isSuspend) {
                        wait();
                    }
                    if (this.isFinished) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void suspend() {
        this.isSuspend = true;
    }

    synchronized void resume() {
        this.isSuspend = false;
        notify();
    }

    synchronized void stop() {
        this.isFinished = true;
        notify();
    }

}
