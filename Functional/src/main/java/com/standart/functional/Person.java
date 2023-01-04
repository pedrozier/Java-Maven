/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.functional;

/**
 *
 * @author zier
 */
public class Person {

    private final String name;
    final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + '}';
    }

}

enum Gender {
    MALE, FEMALE
}
