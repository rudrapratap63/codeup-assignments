/**
 * Author: Rudra Pratap Singh
 * Date: September 03, 2024
 * 
 * Problem: Expand Characters in a String
 * Problem Description:
 * [Given a string containing characters followed by digits, expand each
 *  character by repeating it according to the digit that follows.]
 * 
 */

import java.util.Scanner;

public class StringExpender_Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input : ");
        String str = input.nextLine();

        if(str.length()>100){
            System.out.println("Error: please check input length , input length does not exceed 100 char");
        }
        StringBuilder result = new StringBuilder(); 
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                i++; 
                int count = 0;

                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    count = count * 10 + (str.charAt(i) - '0'); 
                    i++;
                }
                i--; 

                for (int k = 0; k < count; k++) {
                    result.append(currentChar);
                }
            }
        }

        // final result
        System.out.println("The result output is : ");
        System.out.println(result.toString());
        input.close();
    }
}
