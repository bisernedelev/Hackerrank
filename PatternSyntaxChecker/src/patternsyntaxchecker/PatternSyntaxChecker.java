/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author bibo
 */
public class PatternSyntaxChecker {

    /**
     * @param arg s the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();

            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (Exception ex) {

                System.out.println("Invalid");
            }
            testCases--;
        }
    }

}
