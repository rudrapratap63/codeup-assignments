/**
 * Author: Rudra Pratap Singh
 * Date: September 03, 2024
 * 
 * Problem:  Prime Number Checker
 * 
 * Problem Description:
 * [Write a Java program to determine if a given integer is a prime number.]
 * 
 */

import java.util.Scanner;

public class PrimeNumberChecker_Task3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : "); // Take input
        int num = input.nextInt();

        //  The input will be a positive integer between 1 and 10^6.
        if (num>=1 && num<= Math.pow(10, 6)) { 
            if (num ==1 ) { //check for input number 1
                System.out.println("The given no. is Non-Prime Number");
                input.close();
                return;
            }
            for (int i = 2; i < num/2; i++) {
    
                //checking if input no. is dividable by i or not
                if(num%i==0){
                    System.out.println("The given no. is Non-Prime Number");
                    break;
                }else{
                    System.out.println("The given no. is Prime Number");
                    break;
                }
            }
        }else{
            System.out.println("Invalid Input ");
        }
        input.close();
    }
}