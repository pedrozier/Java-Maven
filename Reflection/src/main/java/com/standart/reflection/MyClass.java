/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.reflection;

/**
 *
 * @author zier
 */
public class MyClass {

    private final String stringField;
    private int intField;

    public MyClass(String s, int i) {
        this.stringField = s;
        this.intField = i;
    }

    public String getStringField() {
        return stringField;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public void publicMethod() {
        System.out.println("invoked: public method");
    }

    private void privateMethod() {
        System.out.println("invoked: private method");
    }

    public static void publicStaticMethod() {
        System.out.println("invoked: public static method");
    }

}
