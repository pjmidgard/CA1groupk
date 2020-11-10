/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.e.g;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class RepositoryEG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner musicTaste = new Scanner(System.in);
        
        String music;
        
        System.out.println("What is your favorite music genre?");
        music = musicTaste.nextLine();
        System.out.println("I see your favorite genre is " + music);
        
        
    }
    
}
