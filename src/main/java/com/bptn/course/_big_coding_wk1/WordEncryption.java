package com.bptn.course._big_coding_wk1;

import java.util.Scanner;

public class WordEncryption {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine();
	        scanner.close();

	        String encryptedWord = encryptWord(word);
	        System.out.println("Encrypted word: " + encryptedWord);
	    }

	    /**
	     * Encrypts a word by shifting each letter by one position in the alphabet.
	     * 
	     * @param word the input word to be encrypted
	     * @return the encrypted word
	     */
	    public static String encryptWord(String word) {
	        StringBuilder encryptedWord = new StringBuilder();

	        for (char c : word.toCharArray()) {
	            if (Character.isLowerCase(c)) {
	                // Shift lowercase letter by one position, wrapping around from 'z' to 'a'
	                encryptedWord.append((char) ((c - 'a' + 1) % 26 + 'a'));
	            } else if (Character.isUpperCase(c)) {
	                // Shift uppercase letter by one position, wrapping around from 'Z' to 'A'
	                encryptedWord.append((char) ((c - 'A' + 1) % 26 + 'A'));
	            } else {
	                // Non-alphabetic characters remain unchanged
	                encryptedWord.append(c);
	            }
	        }

	        return encryptedWord.toString();
	    }

}
