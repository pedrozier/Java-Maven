/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.annotation;

@MyAnnotation(info = "overwritten")
@ClassOnlyAnnotation
public class Test {

    void method(String s) {
        System.out.println(s);
    }
}
