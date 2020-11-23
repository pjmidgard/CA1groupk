package myfirstproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 *
 * @author luizaalbuquerque
 */
public class MyFirstProject {

   static void leonardoMethod() {
        
     /**
      * author Leonardo aka IHateMyTiming
      */
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
 
       }catch(Exception e ){System.out.println("There was not an integer");
       }  
           }
    
    
     // main Method will control all the methods      
     public static void main(String[] args) {


      helloWorld();
      MultiplyTwoNumbers();
   


     }



/**
 * @author LuizaAlbuquerque
 */

      static void helloWorld ()  {

        BufferedReader someInputVar = new BufferedReader(new InputStreamReader(System.in));
        String myName = "Luiza";
        System.out.println ("Hello world by: " + myName); 



      }     
            
    
            
/** 
 * @author EdgardPacheco
 */     
            
        static void MultiplyTwoNumbers() {
            int n1 = 5;
            int n2 = 6;
            int r = n2 * n2;

            System.out.println(n1 +"x" + n2 + " = " + r + " by: Edgard Pacheco");
            //// ghjgjhgjkhgjhgjh
        
        }
            
            
            
            
            
}

/** 
 * @author SeanUy
 */  
           
       public class Method {
     static void seanMethod() {
          /**
           * author: SeanUy
           */
          
         System.out.println("This is Sean Uy's code");
          
        }
     
     static int addTwoNumbers(int x,int y){
                                        return x + y;
                                     }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This code will add two numbers together.
        
        seanMethod();
        
        int sum = addTwoNumbers(40,10);
        
        System.out.println("Sum = " + sum);
    
    }
    
}
