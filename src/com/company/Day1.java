package com.company;

public class Day1 {
    public class Solution {

        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);

            /* Declare second integer, double, and String variables. */
            int n;
            double c;
            String o;
            /* Read and save an integer, double, and String to your variables.*/
            n = scan.nextInt();
            c = scan.nextDouble();
            scan.nextLine();

            int sum = i + 0;
            double sumDouble;
            String nString;
            int i2 = scan.nextInt();
            double d2 = scan.nextDouble();
            scan.nextLine();
            String s2 = scan.nextLine();

            System.out.println( i + i2);
            System.out.println(d + d2);
            System.out.println(s + s2);
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

            /* Print the sum of both integer variables on a new line. */

            /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

            scan.close();
        }
    }
}
