/**
 * Author: Rudra Pratap Singh
 * Date: September 03, 2024
 * 
 * Problem: : Longest Substring Without Repeating Characters
 * Problem Description:
 * [Given a string s, find the length of the longest substring without repeating characters.]
 * 
 */

import java.util.*;

import java.util.Scanner;

public class LongestSubstring_Task5 {
    static String solve(String s) {

        int[] lastIndex = new int[256]; 
        Arrays.fill(lastIndex, -1); 

        int left = 0;
        int len = 0;
        int start = 0; // To track the start index of the longest substring

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (lastIndex[currentChar] >= left) {
                // Move left pointer to the right of the last occurrence
                left = lastIndex[currentChar] + 1;
            }

            lastIndex[currentChar] = right;

            //For Update the maximum length of the substring and the starting index
            if (right - left + 1 > len) {
                len = right - left + 1;
                start = left; 
            }
        }

        // Extracte the longest substring
        String longestSubstring = s.substring(start, start + len);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        return String.valueOf(len); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = input.nextLine();
        int length = Integer.parseInt(solve(str)); 

        System.out.println("Length of longest substring: " + length);
        input.close();
    }
}