package com.mycompany.exercise.set1;

// Exercise1
// Palindrome
import java.util.Scanner;

public class Exercise1 {

    Scanner userIn = new Scanner(System.in);

    // main
    public void Palindrome() {
        // heading
        System.out.println("\nPalindrome");

        System.out.println("*Type EXIT to close the program*");

        // main loop
        boolean userLeft = false;
        do {
            // user input
            System.out.print("\nEnter a word: ");
            String userStr = userIn.next();

            if (userStr.equals("exit")) {
                userLeft = true;
                System.out.println("closing...");
            } 
            
            else {
                // checking if the word is a palindrome word
                boolean a = isPalindrome(userStr);

                // result
                System.out.println("Is the word '" + userStr + "' a palindrome? " + a);
            }
        } 
        
        while (!userLeft);
    }
    // ======================================

    public boolean isPalindrome(String str) {
        String reversedStr = "";
        boolean palindrome = false;

        for (int a = (str.length() - 1); a >= 0; a--) {
            String character = String.valueOf(str.charAt(a));
            reversedStr += character;
        }

        if (reversedStr.equals(str)) {
            palindrome = true;
        }

        return palindrome;
    }
}
