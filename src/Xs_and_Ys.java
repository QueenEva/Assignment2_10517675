/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Xs_and_Ys {
    
    public static void main(String[] args){
        System.out.println("x \t\t y");
        for(float x =-10; x<=10; x+=0.5 ){
            System.out.print(x+"\t\t");
            System.out.println(Math.pow(x,2));
            
        }
    }
    
}
