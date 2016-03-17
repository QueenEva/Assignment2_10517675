import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class PinLockout {
       public static void main(String[] args){
        Scanner keyboard  = new Scanner(System.in);
        int pin  = 12345;
        int tries = 0;
        int max = 4;
        System.out.println(" WELCOME TO THE BANK OF MITCHEL");
        System.out.print("ENTER YOUR PIN: ");
	int entry = keyboard.nextInt();
	tries++;

	while ( entry != pin && tries < max )
	{
		System.out.println("\nINCORRECT PIN. TRY AGAIN.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		tries++;
		}
        if ( entry == pin )
                System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	else if ( tries >= max)
		System.out.println("TRY ANOTHER DAY PAL. YOU CAN'T ACCESS YOUR ACCOUNT TODAY!!!");


    }
}
