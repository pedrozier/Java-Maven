/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.strings7;

/**
 *
 * @author zier
 */
public class Strings7 {

    public static void main(String[] args) {

        String[] letters = {"B", "C", "D", "E", "F"};

        String alphabet = "";

        StringBuffer sb = new StringBuffer(); //thread safe

        for (String letter : letters) {
            sb.append(letter);
        }

        alphabet = new String(sb);

        System.out.println(alphabet);

        System.out.println(sb.reverse());

        System.out.println("------------------");

        StringBuilder sb_ = new StringBuilder();
        for (String letter : letters) {
            sb_.append(letter);
        }
        System.out.println(sb_);

    }
}
