/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author zier
 */
public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(5);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10
                = incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(5));

        System.out.println(incrementByOneAndThenMultiply.apply(1, 100));

    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndThenMultiply
            = (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
