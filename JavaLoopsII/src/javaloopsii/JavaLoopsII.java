/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloopsii;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author bibo
 */
public class JavaLoopsII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c1=1;
            int sum=0;
            int totalsum=0;
            int korensuma=1;
            int zav=1;

            for (int c = 0; c < n; c++) {
                for (int d = 0; d < zav; d++) {

                    int sum1=c1*b;                                                                      // 1.2=2
                    c1*=2;                                                                              //1.2+2.2 = 6
                    korensuma++;                                                                         //1.2+2.2+3.2=14
                    sum+=sum1;
                }
                zav++;
                totalsum+=sum;
                System.out.print(totalsum+a+" ");
                totalsum=0;
                korensuma=1;
                sum=0;
                c1=1;

            }
        }
        System.out.println();
        in.close();
        }
    
    }
    

