package javasubstringcomparisons;

import java.util.Scanner;


public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        if (k < s.length()) {

            String currStr = s.substring(0, k);
            smallest = currStr;
            largest = currStr;

            for (int i = 0; i < s.length(); i++) {
                currStr = currStr.substring(1, k) + s.charAt(i);
                if (currStr.compareTo(smallest) < 0) {
                    smallest = currStr;
                }
                if (currStr.compareTo(largest) > 0) {
                    largest = currStr;
                }

            }

        } else {
            smallest = s;
            largest = s;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
