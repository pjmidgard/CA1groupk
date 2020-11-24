package myfirstproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class MyFirstProject {
    
     // main Method will control all the methods   
     
     public static void main(String[] args) {

      helloWorld(); // Luiza
      MultiplyTwoNumbers(); //Edgard
      leonardoMethod(); // Leonardo
      baasan(); //Baasanjargal
      seanMethod(); // Sean

     }   
      /**
       * author Leonardo aka IHateMyTiming
       */

      static void leonardoMethod() {
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
            //// ghjgjhgjkhgjhg
          }


      /**
       * author Baasanjargal
       */

      static void baasan() {
            
              Scanner obj = new Scanner(System.in);
              System.out.println("enter the first integer");
              int a = obj.nextInt();
              System.out.println("enter the second integer");
              int b = obj.nextInt();
              System.out.println("the nultipy two number is:"+(a+b));
            
            }         

          /**
           * author: SeanUy
           */
          
      static void seanMethod() {

       
      // Sean Right again seu code here, the medoth is alread created 
      //Just put you code here 


       }

    
}

