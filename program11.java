import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
   {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            // Convert integer n to string s
            String s = Integer.toString(n);

            // Validation logic required by the problem
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Wrong answer.");
        } finally {
            sc.close();
        }

    }
}
