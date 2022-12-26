/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.standart.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author zier
 */
public class FileIO {

    public static void main(String[] args) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file" + "\n" + "New line");
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
