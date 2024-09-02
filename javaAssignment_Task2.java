import java.util.Scanner;
public class javaAssignment_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine(); //Take a input(string) from user 

        StringBuilder result = new StringBuilder(); // output  

        if (str.length() > 1000 || str.length() == 0 ) {
            System.out.println("Error: Input string must be lower than 1000 characters.");
            return;
        }

        // Checking for  input string will only contain lowercase English letters.
        if (!str.matches("[a-z]+")) {
            System.out.println("Error: Input string must only contain lowercase English letters.");
            return;
        }

        int count = 1; // we starting from count 1 because we have first character
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
        System.out.println(result.toString());
        sc.close(); 
    }
}
