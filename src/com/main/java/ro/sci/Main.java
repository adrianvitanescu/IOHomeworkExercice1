package com.main.java.ro.sci;

/**
 * Write a program which reads the content of a text file from a specified URL
 * and prints it out at the standard output stream.
 * The URL is specified as a command line argument.
 */

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            URL openei = new URL("https://openei.org/doe-opendata/dataset/a7fea769-691d-4536-8ed3-471e993a2445/resource/86c50aa8-e40f-4859-b52e-29bb10166456/download/populationbycountry19802010millions.csv");
            BufferedReader in = new BufferedReader(new InputStreamReader(openei.openStream()));


            String openSource;
            //Read lines by lines from the URL, then printed out
            while ((openSource = in.readLine()) != null) {
                System.out.println(openSource);
            }
        } catch (IOException e) {
            System.out.println("Errors input/output!");
            e.printStackTrace();
        }
    }
}
