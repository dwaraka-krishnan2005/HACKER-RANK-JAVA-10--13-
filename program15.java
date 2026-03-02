import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string and the length k
        String s = sc.next();
        int k = sc.nextInt();
        
        // Start by picking the very first substring as our baseline
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Look at every other possible substring of length k
        // We stop at 's.length() - k' so we don't go past the end
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            
            // If the new substring is "less than" smallest, update smallest
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            
            // If the new substring is "greater than" largest, update largest
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
        
        // Print the results
        System.out.println(smallest);
        System.out.println(largest);
        
        sc.close();
    }
}
