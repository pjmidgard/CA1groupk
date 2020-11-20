/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addtwonumbers;
import java.util.Scanner; // Import the Scanner class to read text files.
import java.io.BufferedWriter;// Writes text to character output stream.

 *
 * @author Angel2014fly
 */
public class AddTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, sum;
      Scanner sc = new Scanner(System.in);
      System.out.println("First number : ");
      num1 = sc.nextInt();
      System.out.println("Second number : ");
      num2 = sc.nextInt();
      sum = addTwo(num1, num2);
      System.out.println("Sum : " + sum);
      sc.close();
    }
     public static int addTwo(int a, int b)
   {
      int sum = a + b;
      return sum;
   }
}
