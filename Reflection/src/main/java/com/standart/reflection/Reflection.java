/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author zier
 */
public class Reflection {

    public static void main(String[] args) throws Exception {

        MyClass myClass = new MyClass("value", 12);

        Field[] fields = myClass.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());

            if (field.getName().equals("stringField")) {
                field.setAccessible(true);
                field.set(myClass, "new value");
            }
        }

        Method[] methods = myClass.getClass().getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());

            if (method.getName().equals("publicMethod")) {
                method.invoke(myClass);
            }

            if (method.getName().equals("privateMethod")) {
                method.setAccessible(true);
                method.invoke(myClass);
            }

            if (method.getName().equals("publicStaticMethod")) {
                method.invoke(null);
            }
        }

        System.out.println(myClass.getStringField());

    }
}
