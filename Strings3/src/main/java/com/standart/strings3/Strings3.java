/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.strings3;

import java.util.Arrays;

/**
 *
 * @author zier
 */
public class Strings3 {

    public static void main(String[] args) {

        String test = "test";

        for (int i = 0; i < test.length(); i++) {
            System.out.println(test.charAt(i));
        }

        char[] te = new char[2];
        test.getChars(0, 2, te, 0);
        System.out.println(te);

        char[] st = new char[2];
        test.getChars(2, 4, st, 0);
        System.out.println(st);

        byte[] teBytes = new byte[2];
        test.getBytes(0, 2, teBytes, 0);

        System.out.println(Arrays.toString(teBytes));

        char[] testChar = test.toCharArray();

        System.out.println(Arrays.toString(testChar));

    }
}
