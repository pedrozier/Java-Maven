/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.strings2;

/**
 *
 * @author zier
 */
public class Strings2 {

    public static void main(String[] args) {

        String hello = "hello";
        String world = "world";

        String helloWorld = hello + world;

        System.out.println(helloWorld);

        String r2 = "result 2+2 = " + (2 + 2);
        String r2_ = "result 2+2 = " + 2 + 2;

        System.out.println(r2);
        System.out.println(r2_);

        String one = String.valueOf(1);

        System.out.println(one);

        String loren = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                + " Morbi cursus est sed mauris volutpat, non faucibus odio faucibus."
                + " Nulla nec felis elementum, sagittis arcu quis, fringilla arcu."
                + " Sed iaculis vitae lectus vel maximus. Cras eros elit, tincidunt ac fringilla a, bibendum id leo."
                + " In a convallis turpis, at elementum metus. Curabitur imperdiet fringilla lacinia."
                + " Fusce non sollicitudin lacus. Fusce blandit pharetra sem, non pharetra ante auctor vitae."
                + " Phasellus maximus lacus vel odio aliquet facilisis. Curabitur ac purus vel velit volutpat vestibulum id a lacus."
                + " Aliquam blandit efficitur orci ac maximus. Pellentesque ac enim quis metus malesuada aliquam. Vestibulum ullamcorper lectus nec enim venenatis,"
                + " non commodo erat convallis. Etiam consequat pulvinar ullamcorper. Curabitur eget lacus turpis.";

        System.out.println(loren);

        String loren2 = " non commodo erat convallis. Etiam consequat pulvinar ullamcorper. Curabitur eget lacus turpis."
                + " Phasellus maximus lacus vel odio aliquet facilisis. Curabitur ac purus vel velit volutpat vestibulum id a lacus.";

        System.out.println(loren2);

    }
}
