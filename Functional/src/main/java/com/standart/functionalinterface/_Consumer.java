/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.standart.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 *
 * @author zier
 */
public class _Consumer {

    public static void main(String[] args) {

        Customer customer = new Customer("name", "9 9999-9999");

        greetCustomer(customer);

        greetCustomerConsumer.accept(customer);

        greetCustomerBiConsumer.accept(customer, true);
        greetCustomerBiConsumer.accept(customer, false);

    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + " Phone Number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " Phone Number " + customer.customerPhoneNumber);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber)
            -> System.out.println("Hello " + customer.customerName + " Phone Number " + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));

    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }

}
