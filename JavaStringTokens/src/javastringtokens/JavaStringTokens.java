/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringtokens;

import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class JavaStringTokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        boolean flag = true;
       
       String []result =  s.split("[\\p{Punct}\\s]+");
        if (result.length==0) {
            System.out.println("0");
        }else{
        
           if (result[0].equals("")) {
                flag=false;
            } 
       
        if (flag) {
            System.out.println(result.length);
        }else{
        System.out.println(result.length-1);
        }
        
        for (String t:result) {
            if (!t.equals("")) {
                System.out.println(t);
            }
            
        }
        
        scan.close();
    }
    }  
}
