/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.functionalinterface;

import java.util.function.Predicate;

/**
 *
 * @author zier
 */
public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000001"));
        System.out.println(isPhoneNumberValid("09000002310"));
        System.out.println(isPhoneNumberValid("07000002310029930"));
        System.out.println(isPhoneNumberValid("0700032"));

        System.out.println("-----");

        System.out.println(isPhoneNumberValidPredicate.test("07000000001"));
        System.out.println(isPhoneNumberValidPredicate.test("09000002310"));
        System.out.println(isPhoneNumberValidPredicate.test("07000002310029930"));
        System.out.println(isPhoneNumberValidPredicate.test("0700032"));

        System.out.println("-----");

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000023451"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000020451"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0703"));

        System.out.println("-----");

        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000023451"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000020451"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("0703"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber
            -> phoneNumber.contains("3");

}
