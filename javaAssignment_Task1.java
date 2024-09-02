import java.util.Scanner;

public class javaAssignment_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.length()>100){
            System.out.println("please check input length , input length not be more than 100 char");
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
        System.out.println(result.toString());
        sc.close();
    }
}