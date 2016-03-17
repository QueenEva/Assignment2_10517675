import java.util.Random;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Dice {
    public static void main(String[] args){
        Random r = new Random();
        int die1,die2,sum;
        System.out.println("HERE COMES THE DICE!");
        
        die1  = 1 + r.nextInt(6);
        die2  = 1 + r.nextInt(6);
        System.out.println("Roll #1: " + die1);
        System.out.println("Roll #2: " + die2);
        
        sum = die1 + die2;
        System.out.println("The total is " +sum +"!");
        
    }
}
