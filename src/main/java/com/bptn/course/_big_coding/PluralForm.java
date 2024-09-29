package com.bptn.course._big_coding;

import java.util.Scanner;

public class PluralForm {
	
	/*
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int amt = scanner.nextInt();

        System.out.print("Enter a singular noun: ");
        String word = scanner.nextLine();

        String pluralWord = getPlural(word, amt);
        System.out.println(amt + " " + pluralWord);
        
        //scanner.close();
    }

    public static String getPlural(String word, int amt) {
        if (amt == 1) {
            return word;
        }

        if (word.endsWith("fe")) {
            return word.substring(0, word.length() - 2) + "ves";
        } else if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("oy") && !word.endsWith("ey") && !word.endsWith("uy")) {
            return word.substring(0, word.length() - 1) + "ies";
        } else if (word.endsWith("sh") || word.endsWith("ch")) {
            return word + "es";
        } else if (word.endsWith("us")) {
            return word.substring(0, word.length() - 2) + "i";
        } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
            return word + "s";
        } else {
            return word + "s";
        }
    }
}

*/
	
	
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a non-negative integer:");
        int amt = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()

        // Prompt the user to enter a singular noun
        System.out.println("Enter a singular noun:");
        String word = scanner.nextLine();

        // Determine the plural form of the word
        String pluralWord = getPluralForm(word, amt);

        // Print the result
        System.out.println(amt + " " + pluralWord);

        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to determine the plural form of a word based on the amount
    public static String getPluralForm(String word, int amt) {
        // If the amount is 1, return the word as is
        if (amt == 1) {
            return word;
        }

        // Handle special cases for words ending in "fe"
        if (word.endsWith("fe")) {
            return word.substring(0, word.length() - 2) + "ves";
        }

        // Handle special cases for words ending in "y"
        if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("oy") && !word.endsWith("ey") && !word.endsWith("uy")) {
            return word.substring(0, word.length() - 1) + "ies";
        }

        // Handle words ending in "sh", "ch", "x", or "z"
        if (word.endsWith("sh") || word.endsWith("ch") || word.endsWith("x") || word.endsWith("z")) {
            return word + "es";
        }

        // Handle special cases for words ending in "us"
        if (word.endsWith("us")) {
            return word.substring(0, word.length() - 2) + "i";
        }

        // Handle special cases for words ending in "ay", "oy", "ey", "uy"
        if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
            return word + "s";
        }

        // Default case: add "s" to the word
        return word + "s";
    }
}