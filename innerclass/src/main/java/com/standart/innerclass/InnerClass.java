/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.innerclass;

import com.standart.innerclass.External.AnonymousClass;
import com.standart.innerclass.External.Internal;
import com.standart.innerclass.External.StaticClass;

/**
 *
 * @author zier
 */
public class InnerClass {

    public static void main(String[] args) {

        External external = new External();
        Internal internal = external.new Internal();

        AnonymousClass anonymousClass = external.new AnonymousClass() {
            public void print() {
                System.out.println("overwritten text");
            }
        };

        Text text = new Text() {
            public void print() {
                System.out.println("interface as anonymous class");
            }
        };

        internal.inPrint();
        StaticClass.staticPrint();
        anonymousClass.print();
        text.print();
    }
}
