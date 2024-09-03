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
    static void verify(String str) {
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        if(count==0) {
            System.out.println("No integer Found to catch frequency");
        }
        else{
            func(str.toLowerCase());
        }
    }	
    static void func(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                i++;
                int frequency = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    frequency = frequency*10+(str.charAt(i) - '0'); 
                    i++;
                }
                i--;
                for (int k = 0; k < frequency; k++) {
                    result.append(currentChar);
                }
            }
        }
        System.out.println("The result of the given input is: ");
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int cases;
//        System.out.println(constant.ENTER_NUMBER);
//        int number = sc.nextInt();
        int count=3;
        while(count>0) {
            System.out.println("Enter a input string");
            String str = input.nextLine();
            if(str.length()>100){
                System.out.println("String length not be exceed 100 characters");
            }
            else
            {
                verify(str);
                count--;
            }      
        }

        input.close();
}
}
