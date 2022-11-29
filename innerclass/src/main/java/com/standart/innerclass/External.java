/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.innerclass;

/**
 *
 * @author zier
 */
public class External {

    private String text = "External text";

    public class Internal {

        private String text = "Internal text";

        public void inPrint() {
            System.out.println(text);
        }

    }

    public static class StaticClass {

        public static void staticPrint() {
            System.out.println("static text");
        }
    }

    public class AnonymousClass {

        public void print() {
            System.out.println("anonymous text");
        }
    }

}
