import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class FortuneCookie {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int x = 1 + r.nextInt(100);
        int option;
        
       
        System.out.println(" Welcome to Fortune Cookie! ");
        System.out.println("What is your favorite color? \n 1. BLUE 2. YELLOW 3. RED 4. GREEN 5. PURPLE 6. PINK 7. WHITE 8. BLACK \n CHOOSE A NUIMBER ");
        
        option= input.nextInt();
        
        if (option==1)
        {
             System.out.println( " Fortune Cookie says: You will find happiness with your new love");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.println();
        } 
         
        if (option==2)
        {
             System.out.println( " Fortune Cookie says: You will shine in any proffession you do");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.println();
          
        } 
          if (option==3)
        {
            System.out.println( " Fortune Cookie says: You will have a very romantic relationship with your best friend");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.println();
        }
          if (option==4)
        {
            System.out.println( " Fortune Cookie says: You will have long life and prosperity");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t " );
         System.out.print( 1 + r.nextInt(100) + "\t " );
         System.out.print( 1 + r.nextInt(100) + "\t " );
         System.out.print( 1 + r.nextInt(100) + "\t " );
         System.out.print( 1 + r.nextInt(100) + "\t " );
         System.out.println();
        }
          if (option==5)
        {
              System.out.println(" Fortune Cookie says: You will marry a Royal princess");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.println();
        }  
          if (option==6)
          {
              System.out.println(" Fortune Cookie says: You will have two lovely girls as your daughter");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.println();     
          }
          if (option==7)
          {
              System.out.println(" Fortune Cookie says: You are so kind and lovely and your heart is pure");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.println();
          }
          if (option==8)
          {
              System.out.println(" Fortune Cookie says: Stick to your wife!");
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.print( 1 + r.nextInt(100) + "\t" );
         System.out.println();
          }
              
        
        
        
    
}
    
}
