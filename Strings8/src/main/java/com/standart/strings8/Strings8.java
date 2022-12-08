/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.strings8;

import java.util.StringTokenizer;

/**
 *
 * @author zier
 */
public class Strings8 {

    public static void main(String[] args) {

        String fromFile = "1;name;30";

        StringTokenizer st = new StringTokenizer(fromFile, ";");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
