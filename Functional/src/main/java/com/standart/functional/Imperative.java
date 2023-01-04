/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.functional;

import java.util.ArrayList;
import java.util.List;

public class Imperative {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(("test0M"), Gender.MALE),
                new Person(("test1F"), Gender.FEMALE),
                new Person(("test2M"), Gender.MALE),
                new Person(("test3F"), Gender.FEMALE),
                new Person(("test4M"), Gender.MALE)
        );

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }

            for (Person female : females) {
                System.out.println(female);

            }
        }

    }

}
