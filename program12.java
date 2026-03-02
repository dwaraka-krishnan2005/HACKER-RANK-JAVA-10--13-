import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN"); // Use "en", "IN" for Rs. in Java 8
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        // 2. Create NumberFormat instances
        NumberFormat us = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat france = NumberFormat.getCurrencyInstance(franceLocale);

        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
