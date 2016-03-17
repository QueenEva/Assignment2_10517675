import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class AddingValues {
     public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int sum = 0, num;
        System.out.println("I will add up the numbers you give me");
        
        while (true){
            System.out.println("Number:");
            num  = n.nextInt();
            sum  = sum + num;
            System.out.println("The total so far is "+ sum);
            if(num == 0){
                break;
            }
        }
    } 
}

