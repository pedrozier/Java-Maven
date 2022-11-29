/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.garbagecollector;

/**
 *
 * @author zier
 */
public class GarbageCollector {

    static final long MB = 1024 * 1024;

    static void printMemory() {
        System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / MB + " MB");
    }

    public static void main(String[] args) {

        printMemory();

        Contact[] contacts = new Contact[1000000];
        Contact contact;

        for (int i = 0; i < contacts.length; i++) {
            contact = new Contact("name" + i, "123" + i, i + "@email.com");
            contacts[i] = contact;
        }

        printMemory();

        contacts = null;

        printMemory();

        Runtime.getRuntime().gc();

        printMemory();

    }
}
