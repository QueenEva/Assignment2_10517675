import java.util.Scanner;
import java.util.Random;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class AguessingNumberGame {
    public static void main(String[]args){
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        int answer = 1 + r.nextInt(10);
        int choice;
       
        String response = " ";
        
        System.out.println(" Hey dear lets play some number guessing game!");
        System.out.println("I'm thinking of a number from 1 to 10 right, now let's see if you can gues it right");
        System.out.println("your guess: ");
        choice = input.nextInt();
        
        if (answer==choice)
            response = " OMG! you were in my head...you guessed right!";
        else if (answer!=choice)
            response = "Sorry i was thinking about "+ answer;
        else
            response = " sorry you are so off my league of thought";
        System.out.print("ok lets see what you got: \n" + response);
            
        
        
        
                
        
    }
    
}
