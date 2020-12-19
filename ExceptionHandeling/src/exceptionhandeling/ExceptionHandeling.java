/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandeling;
import java.util.*;
/**
 *
 * @author Steven
 */
public class ExceptionHandeling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int x = 1;
        
        do{
        
            try{
                System.out.println("Enter first number:");

                int num1 = input.nextInt();

                System.out.println("Enter second number:");

                int num2 = input.nextInt();

                int sum = num1/num2;

                System.out.println(sum);
                x = 2;
            } catch (Exception e){
                System.out.println("You can't do that.");
            }
        
        } while(x==1);
    }
}
    

