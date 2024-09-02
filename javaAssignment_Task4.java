import java.util.Scanner;

public class javaAssignment_Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an no. between 0 to 999 : ");
        int num = sc.nextInt(); // Take input

        String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        if (num>0 && num<1000) {
            StringBuilder result = new StringBuilder();

            //Use Case For less then 20
            if (num<20) { 
                System.out.println(units[num]);
                return;
            }

            //Use Case for 20 to 99
            if(num>=20 && num<100){ 
                int rem = 0;
                while (num>0) {
                    rem = num%10 + rem;
                    num = num/10;
                    if(rem ==0){
                        result.append(tens[num]);
                    }else{
                        result.append(tens[num]+" ").append(units[rem]);
                    }
                    break;
                }
            }

            //Use Case for 100 to 999
            if (num>=100 && num<1000) {
                result.append(units[num/100]+" hundread ");
                num = num % 100;

                int rem = 0;
                while (num>0) {
                    rem = num%10 + rem;
                    num = num/10;
                    if(rem ==0){
                        result.append(tens[num]);
                    }else{
                        result.append(tens[num]+" ").append(units[rem]);
                    }
                    break;
                }
            }

            System.out.print(result); //Final Result
        }else{
            System.out.println("Invalid input : The input will be a positive integer between 1 and 1000.");
        }
    }
}
