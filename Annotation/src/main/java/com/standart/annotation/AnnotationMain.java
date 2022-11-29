/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.getClass().isAnnotationPresent(MyAnnotation.class));
        System.out.println(test.getClass().isAnnotationPresent(ClassOnlyAnnotation.class));

        System.out.println(test.getClass().getAnnotation(MyAnnotation.class).info());

        for (Method method : test.getClass().getDeclaredMethods()) {
            System.out.println(method);
        }
        for (Annotation annotation : test.getClass().getAnnotations()) {
            System.out.println(annotation);
        }
    }
}
