/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inttostring;

import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class IntToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   in.close();
   String s;

   s = String.valueOf(n);
       
   System.out.println(s);
   
    
}}
