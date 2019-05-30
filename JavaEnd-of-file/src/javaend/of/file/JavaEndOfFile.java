/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaend.of.file;

import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class JavaEndOfFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =1;
        
        while(sc.hasNext()){
            String s  = sc.nextLine();
            System.out.println(a+" "+s);
            a++;
        }
                
        
    }
    
}
