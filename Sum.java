/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float a,b,sum;
       Scanner sobj=new Scanner(System.in);
       System.out.println("enter the first number");
       a=sobj.nextFloat();
       System.out.println("enter the second number");
       b=sobj.nextFloat();
       sum=a+b;
       System.out .println("sum is = "+sum);
    }
    
}
