/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author seanuy
 */
public class Method {
     static void seanMethod() {
          /**
           * author: seanuy
           */
          
          System.out.println("This is seanuy code")
     }
     
     static int addNumbers(int x,int y){
                                        return x + y;
                                     }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        seanMethod();
        
        int sum = addNumbers(40,10);
        
        System.out.println("Sum = " + sum);
    
    }
    

