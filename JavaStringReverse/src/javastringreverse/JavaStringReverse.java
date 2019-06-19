/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringreverse;

import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class JavaStringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;
        int a=0;
        for (int i = A.length() - 1; i >= 0; i-- ) {
            if (A.charAt(i)!=A.charAt(a)) {
                isPalindrome = false;
            }
                a++;
        }
        if (isPalindrome) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
