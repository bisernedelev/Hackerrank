/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jex;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class JEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
           int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println(c);
        } catch (InputMismatchException e1) {
            System.out.println(e1.getClass().getName());

        }
        catch (ArithmeticException e2) {
            System.out.println(e2.getClass().getName() + " by zero");

        } 
    }

}
