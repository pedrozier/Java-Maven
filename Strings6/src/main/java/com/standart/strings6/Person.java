/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.strings6;

/**
 *
 * @author zier
 */
public class Person {

    private int cod;
    private String name;
    private int age;

    public Person(int cod, String name, int age) {
        this.cod = cod;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "cod=" + cod + ", name=" + name + ", age=" + age + '}';
    }

}
