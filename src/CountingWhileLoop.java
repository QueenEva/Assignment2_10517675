import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class CountingWhileLoop {
    
        public static void main(String[] args )
        {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = input.nextLine();
        System.out.println("How many times");
        int nt  = input.nextInt();
        
        int n = 0;
        while(true){ 
            if(n < nt){
                System.out.println( ( n+10 )+  ". " + message);
            n ++;
            }
           
        }
    }
}


// Q1... It increaments the value of n by one after each iteration.

        
    



