package com.example.calculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class CalculatorAppApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, choice;
        System.out.print("ENTER FIRST NUMBER :");
        number1 = scanner.nextInt();
        System.out.println("ENTER SECONDARY NUUMBER :");
        number2 = scanner.nextInt();
        System.out.println("PLEASE CHOOSE WHAT YOU WANT TO DO :");
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Divisiom");
        System.out.print("CHOICE :");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Addition : " + (number1 + number2));

        } else if (choice == 2) {
            System.out.println("Subtraction : " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Multiplication : " + (number1 * number2));
        } else if (choice == 4) {
            System.out.println("Division : " + (number1 / number2));
        }
    else {
            System.out.println("UNAVAILABLE SERVICE");
        }
    }
}
