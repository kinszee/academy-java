package com.bptn.course._big_coding;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            // Display the calculator menu
            System.out.println("/...Calculator Menu.../");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");

            // Get the user's choice
            int choice = scanner.nextInt();

            // Variables to store numbers
            double num1, num2, result;

            // Perform the chosen operation
            if (choice == 1) { // Addition
                System.out.println("Enter the first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if (choice == 2) { // Subtraction
                System.out.println("Enter the first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if (choice == 3) { // Multiplication
                System.out.println("Enter the first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if (choice == 4) { // Division
                System.out.println("Enter the first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The quotient of the numbers " + num1 + " and " + num2 + " is = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            } else if (choice == 5) { // Square a number
                System.out.println("Enter the number:");
                num1 = scanner.nextDouble();
                result = num1 * num1;
                System.out.println("The square of the number " + num1 + " is = " + result);
            } else if (choice == 6) { // Square root
                System.out.println("Enter the number:");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("The square root of the number " + num1 + " is = " + result);
                } else {
                    System.out.println("Square root of a negative number is not allowed.");
                }
            } else if (choice == 7) { // Reciprocal
                System.out.println("Enter the number:");
                num1 = scanner.nextDouble();
                if (num1 != 0) {
                    result = 1 / num1;
                    System.out.println("The reciprocal of the number " + num1 + " is = " + result);
                } else {
                    System.out.println("Reciprocal of zero is not allowed.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            // Ask if the user wants to continue
            System.out.println("To continue calculation Press 1, else press any other number to exit");
            int continueChoice = scanner.nextInt();
            if (continueChoice != 1) {
                continueCalculation = false;
            }
        }

        // Close the scanner
        scanner.close();
    }
	

}
