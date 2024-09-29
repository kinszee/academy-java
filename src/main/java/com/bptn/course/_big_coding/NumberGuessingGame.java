package com.bptn.course._big_coding;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Set the target number to 23
        int targetNumber = 23;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a flag to indicate whether the user has guessed correctly
        boolean guessedCorrectly = false;

        // Loop until the user guesses correctly
        while (!guessedCorrectly) {
            // Prompt the user to enter a guess
            System.out.print("Enter a number between 1 and 100: ");
            int guess = scanner.nextInt();

            // Validate the input to ensure it's within the valid range
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            // Compare the user's guess with the target number
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                guessedCorrectly = true;
            }
        }

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}

/* Summary:
This task was new to me because it required using a loop to repeatedly prompt the user for input until they guessed correctly. I had to think carefully about how to validate the input to ensure it was 
within the valid range, and how to provide appropriate feedback to the user.

One issue I ran into was ensuring that the program continued to loop until the user guessed correctly. I had to use a flag to indicate whether the user had guessed correctly, and use a while loop to 
repeat the guessing process until the flag was set to true.

From this lesson, I will remember to use loops to repeatedly prompt the user for input until they provide the correct answer, and to validate input to ensure it's within the valid range. 
55
I will also make sure to provide clear and concise feedback to the user to help them guess correctly. */