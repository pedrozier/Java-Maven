/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.threads;

/**
 *
 * @author zier
 */
public class Calc {

    public synchronized int sum(int[] nums, String name, int sleepTime) {

        int total = 0;

        try {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(name + " " + total + "  +  " + nums[i]);
                total += nums[i];
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return total;
    }

}
