import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        // 1. Sum of lengths
        System.out.println(A.length() + B.length());
        
        // 2. Lexicographical comparison
        // Returns > 0 if A is alphabetically "larger" than B
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        // 3. Capitalize first letter of both
        String outputA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String outputB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(outputA + " " + outputB);
        
        sc.close();
    }
}
