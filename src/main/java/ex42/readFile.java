/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 RAYME PERSAD
 */
/*
Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
 */


package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Employee {
    // Method to print the details in tabular format.
    // It takes the name of the filename as its parameter
    public void printDetails(String filename) {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!!");
        }
    }

    // Driver method to test the code
    public static void main(String[] args) {

        Employee emp = new Employee();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        emp.printDetails("exercise42_input.txt");
    }
}
