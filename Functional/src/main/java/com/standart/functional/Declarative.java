/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.functional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author zier
 */
public class Declarative {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(("test0M"), Gender.MALE),
                new Person(("test1F"), Gender.FEMALE),
                new Person(("test2M"), Gender.MALE),
                new Person(("test3F"), Gender.FEMALE),
                new Person(("test4M"), Gender.MALE)
        );

        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        List<Person> females = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        females.forEach(System.out::println);

    }
}
