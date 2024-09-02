import java.util.*;

public class javaAssignment_Task5 {
    static int solve(String s) {

        //Creating Hashmap data structure to store character and its index
        HashMap<Character,Integer> mpp = new HashMap<Character, Integer> ();

        //Intialize two pointers for sliding window
        int left = 0, right = 0;
        int n = s.length();

        //Variable that will return maximum length of substring  
        int len = 0;
        while(right<n) {

            //Checks in map if occurence is repeated
            if(mpp.containsKey(s.charAt(right))) {

                //Left stores greater index at which repeated character is found
                //Results in shifting window
                left = Math.max(mpp.get(s.charAt(right))+1,left);
            }
            mpp.put(s.charAt(right), right);

            //Returns maximum length of substring required
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter any string:");   
        String str=sc.nextLine();
        System.out.println(solve(str));
    }
}