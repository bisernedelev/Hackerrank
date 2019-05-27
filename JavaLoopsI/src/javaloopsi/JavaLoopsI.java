/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloopsi;

import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class JavaLoopsI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i<=10; i++) {
            int a = n*i;
            System.out.printf("%d x %d = %d%n",n,i,a);
            
        }
        scanner.close();
    }
    
}
