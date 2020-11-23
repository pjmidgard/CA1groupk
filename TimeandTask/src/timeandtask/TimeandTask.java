/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeandtask;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class TimeandTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner myKb = new Scanner(System.in);
       
       int num1;
       int num2;
       try{
        System.out.println("Please enter an integer");
        num1 = myKb.nextInt();
           System.out.println("Please enter a second integer");
        num2 = myKb.nextInt();
        int num3 = num1 - num2;
        
           System.out.println("The result of " + num1 + " - " + num2 + " is " + num3);
    }catch(Exception e){System.out.println("Please only input integers");
    }
    }
    
}
