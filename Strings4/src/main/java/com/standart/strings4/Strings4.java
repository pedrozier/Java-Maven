/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.strings4;

/**
 *
 * @author zier
 */
public class Strings4 {

    public static void main(String[] args) {

        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola);

        System.out.println("ola equals ola2 = " + ola.equals(ola2)); //flase
        System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true

        System.out.println("ola equalsIgnoreCase ola2 = " + ola.equalsIgnoreCase(ola2)); //true

        System.out.println("ola == ola2 = " + (ola == ola2)); //false
        System.out.println("ola == ola3 = " + (ola == ola3)); //true  //ola & ola3 have same memory reference
        System.out.println("ola == ola4 = " + (ola == ola4)); //false

        System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true //same content // equals is more safe

        System.out.println("----------------------------------------");

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(2, ana, 0, 2));

        System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

        System.out.println(banana.endsWith(ana));
        System.out.println(banana.startsWith(ban));

        System.out.println("----------------------------------------");

        String a = "a";
        String b = "b";
        String aM = "A";

        //-1 when a > b //0 when a == b //1 or >1 when a < b
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo(aM));

    }
}
