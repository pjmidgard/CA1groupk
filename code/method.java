package method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Method {
    
     // main Method will control all the methods   
     
     public static void main(String[] args) {

      helloWorld(); // Luiza
      MultiplyTwoNumbers(); //Edgard
      leonardoMethod(); // Leonardo
      baasan(); //Baasanjargal
      seanMethod(); // Sean
      methodm();//Jurijus   

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
 *
 * @author SeanUy
 */
public class Method {
     static void seanMethod() {
          /**
           * author: SeanUy
           */
          
         System.out.println("This is Sean's code");
          
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
    
}          
    /*
    * author: Jurijus
    */
    public static float addf(float n1, float n2) {
   float total;
    total=n1/n2;
   return total; 
}
     //metod: divide one number from another in the program.
    static void methodm()
             
             {
                      BufferedReader myKeyboard = new BufferedReader(new InputStreamReader(System.in)); 
      float anum1, bnum2, total;
        
      System.out.println("Please enter 1st number");
        
        try{
            anum1 = Float.parseFloat(myKeyboard.readLine());
            //readLine() method ONLY reads text - need Integer.parseInt to convert to int value (if possible)
        
            System.out.println("Please enter 2nd number");
             bnum2 = Float.parseFloat(myKeyboard.readLine());
          if (bnum2==0)
                  {
                    System.out.println("Error");//if divide by 0 show error
                    System.exit(0);
                 }
          
               total = addf(anum1, bnum2);//I have made the addf metod for dividing the numbers in the program. 
         
        System.out.println(" num1 " + anum1 + " and num2 " + bnum2 + " sum numbers " + total);//The program show numbers that is add.        
          
       
        }
        catch (Exception e){
            
            System.out.println("That is not valid input -- only numbers allowed");//Error this varibles not numbers in the program.
        }
                 
             }
    /*The end*/
  }
