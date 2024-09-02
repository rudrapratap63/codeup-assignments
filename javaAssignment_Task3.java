import java.util.Scanner;

public class javaAssignment_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : "); // Take input
        int num = sc.nextInt();

        //  The input will be a positive integer between 1 and 10^6.
        if (num>=1 && num<= Math.pow(10, 6)) { 
            if (num ==1 ) { //check for input number 1
                System.out.println("The given no. is Non-Prime Number");
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
    }
}
