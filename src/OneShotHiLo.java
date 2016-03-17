/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class OneShotHiLo {
    public static void main(String[]args){
         Random r = new Random();
         Scanner input = new Scanner(System.in);
         int guess;
         int x = 1 + r.nextInt(100);
         
         System.out.println( "I'm thinking of a number between 1-100. try to guess it.");
         guess = input.nextInt();
         
         if (guess == x)
             System.out.println("Yeay! you guessed it right! what are the odds? ");
         else if (guess < x)
             System.out.println( " Sorry, you are too low. I was thinking of " + x);
         else if (guess > x)
             System.out.println(" Sorry, you are too high. i was thinking of " + x);
         else
             System.out.println("You are just too dump for my liking");
    }
    
}
