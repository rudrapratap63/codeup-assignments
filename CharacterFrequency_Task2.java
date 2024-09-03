/**
 * Author: Rudra Pratap Singh
 * Date: September 03, 2024
 * 
 * Problem: Character Frequency in a String
 * Problem Description:
 * [Write a Java program that takes a string input and outputs the frequency of
 *  each character in a compressed form.]
 * 
 */

import java.util.Scanner;
public class CharacterFrequency_Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a string input : ");
        String str = input.nextLine(); 

        StringBuilder result = new StringBuilder(); 

        if (str.length() > 1000 || str.length() == 0 ) {
            System.out.println("Error: Input string must be lower than 1000 characters.");
            input.close();
            return;
        }

        // Checking for input string that only contains lowercase English letters.
        if (!str.matches("[a-z]+")) {
            System.out.println("Error: Input string must only contain lowercase English letters.");
            input.close();
            return;
        }

        int count = 1; 
        char currentChar = str.charAt(0); 
        for (int i = 1; i < str.length(); i++) {

            if(currentChar == str.charAt(i)){
                count++;
            }else{
                result.append(currentChar);
                result.append(count);
                currentChar = str.charAt(i);
                count=1;
            }
        }
        result.append(currentChar);  // Append last character of input string
        result.append(count);   //Append count of last character
        System.out.println("the result is : "+result.toString());
        input.close(); 
    }
}
