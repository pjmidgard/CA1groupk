/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
We enjoy writing programs.

We write software that has:

Jurijus: (Class: Authors; Method: Authors and / method.)
 */




package ca1groupk;

import java.io.BufferedReader;//Public class BufferedReader extends Reader.
import java.io.InputStreamReader;//An InputStreamReader is a bridge from byte streams to character streams.
/**
 *
 * @author Jurijus Pacalovas
 */
public class CA1groupk {

    static void MyAuthors()
    {
      //Class: Authors in the program.
        //I have created the CA1groupk main class in the program.
        //I have created the myObj.x. object in the program.
        MyAuthors myObjl = new MyAuthors();
        System.out.println(myObjl.x);
        System.out.println(myObjl.x1);
        System.out.println(myObjl.x2);
        System.out.println(myObjl.x3);
        System.out.println(myObjl.x4);
        System.out.println(myObjl.x5);
        System.out.println(myObjl.x6);
        System.out.println(myObjl.x7);
    }
        
    /**
     * @param args the command line arguments
     */
  
    
    //method divide one number from another in the program.
     
     public static int addf(int n1, int n2) {
   int total;
   
    
    total=n1/n2;
    
    
   return total; 
}
     //metod minus  one number from another in the program.

     
    static void methodm()
             
             {
                      BufferedReader myKeyboard = new BufferedReader(new InputStreamReader(System.in)); 
      int anum1, bnum2, total;
        
      System.out.println("Please enter 1st number");
        
        try{
            anum1 = Integer.parseInt(myKeyboard.readLine()); 
            //readLine() method ONLY reads text - need Integer.parseInt to convert to int value (if possible)
        
            System.out.println("Please enter 2nd number");
             bnum2 = Integer.parseInt(myKeyboard.readLine());
          if (anum2==0)
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
   
   //Method 2: Divide two numbers
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        MyAuthors();// I have crated the MyAuthors method for Authors in the program
       //Method 1: print ‘Hello World’ in the program.
     
 
        methodm();// I have crated the / method in the program
        
        
    }
      
      
        
    }
    
    

