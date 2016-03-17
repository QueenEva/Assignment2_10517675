import java.util.Random;
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class KeepGuessing {
    public static void main(String[]args){
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        int answer = 1 + r.nextInt(10);
        int choice;
       
        String response = " ";
        
        System.out.println(" Hey dear lets play some number guessing game!");
        System.out.println("I have chosen of a number from 1 to 10 right, now let's see if you can gues it right");
        System.out.println("your guess: ");
        choice = input.nextInt();
        
      
        while(answer!=choice)
        {
            response = "Sorry that is incorrect. I was thinking about "+ answer + " Guess Again!";
        System.out.print("ok lets see what you got: \n" + response);
            
        }
        System.out.println("That's right! You are a good guesser.");
    
    }
}

        

