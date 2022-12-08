/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.strings;

/**
 *
 * @author zier
 */
public class Strings {

    public static void main(String[] args) {

        String s = new String();
        System.out.println(s);

        String test = new String("Test");
        System.out.println(test);

        String test1 = new String(test);
        System.out.println(test1);

        char[] chars = {'c', 'h', 'a', 'r'};
        String test2 = new String(chars);
        System.out.println(test2);

        String test3 = new String(chars, 0, 2);
        System.out.println(test3);

        byte[] ascii = {65, 66, 67, 68, 69};
        String test4 = new String(ascii);
        System.out.println(test4);

        String test5 = new String(ascii, 1, 3);
        System.out.println(test5);

        String s1 = "s";
        String s2 = "s";

        System.out.println(s1);
        System.out.println(s2);

    }
}
