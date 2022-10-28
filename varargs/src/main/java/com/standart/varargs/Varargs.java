/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.varargs;

/**
 *
 * @author zier
 */
public class Varargs {

    public static void main(String[] args) {
        System.out.println(soma());
        System.out.println(soma(3, 3));
        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(method("test", " ", "string", "00"));
    }

    static int soma(Integer... args) {

        int total = 0;

        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

    static String method(String... args) {

        String total = "";

        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }
}
