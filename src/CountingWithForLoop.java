import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class CountingWithForLoop {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Type in message, and I'll display it five times");
      System.out.print( "Message: " );
      String message = input.nextLine();

        for ( int n = 2 ; n <= 10 ; n +=2 )
         {
            System.out.println( n + ". " + message );
           
        }

    }
}
