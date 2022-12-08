/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.strings6;

/**
 *
 * @author zier
 */
public class Strings6 {

    public static void main(String[] args) {

        String test1 = "this is a test";

        System.out.println(test1);
        System.out.println(test1.substring(5));
        System.out.println(test1.substring(5, 7));

        String hello = "hello";
        String world = "world";
        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        String space = "i p a c e";
        String noSpace = space.replace('i', 's');
        noSpace = noSpace.replaceAll(" ", "");
        System.out.println(noSpace);

        String name = " my name is: ";
        System.out.println(name.trim());

        System.out.println("---------------------------------");

        String test = "Test";

        System.out.println(test.toLowerCase());
        System.out.println(test.toUpperCase());

        System.out.println("---------------------------------");

        String alphabet = String.join(", ", "A", "B", "C", "D");
        System.out.println(alphabet);

        String[] letters = alphabet.split(", ");

        for (String letter : letters) {
            System.out.println(letter);
        }

        String fromFile = "1;name;23";
        String[] infos = fromFile.split(";");
        Person person = new Person(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
        System.out.println(person);

    }
}
