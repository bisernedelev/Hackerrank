/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsintroduction;

import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class StringsIntroduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)<1) {
            System.out.println("No");
        }else {
        
        System.out.println("YES");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1));
    }
    
}
