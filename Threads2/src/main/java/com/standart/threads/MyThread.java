/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.threads;

/**
 *
 * @author zier
 */
public class MyThread implements Runnable {

    public String name;
    public int[] nums;
    public int sleepTime;
    public static Calc calc = new Calc();

    public MyThread(String name, int[] nums, int sleepTime) {
        this.name = name;
        this.nums = nums;
        this.sleepTime = sleepTime;
        //new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println(name + " start ");
        int result = calc.sum(nums, name, sleepTime);
        System.out.println(name + " end " + result);

    }

}
