/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaanagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();
        boolean result = true;
        if (a.length() != b.length()) {
            result = false;
        } else {

            char[] charsA = aLowerCase.toCharArray();
            char[] charsB = bLowerCase.toCharArray();
            Arrays.sort(charsA);
            Arrays.sort(charsB);
            for (int i = 0; i < charsA.length; i++) {
                if (charsA[i] != charsB[i]) {
                    result = false;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
