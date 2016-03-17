import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class EnterPin {
    public static void main(String[]args){
        Scanner keyboard = new Scanner (System.in);
        int pin = 12345;
        int entry;
        
        System.out.println("WELCOME TO THE BANK OF MITCHEL");
        System.out.println("ENTER YOUR PIN");
        entry = keyboard.nextInt();
        
        while ( entry !=pin)
        {
            System.out.println("INCORRECT PIN...! TRY AGAIN");
            System.out.println("ENTER YOUR PIN");
            entry = keyboard.nextInt();
            
        }
        System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
                
        
        
    }
    
    
}
