/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner steven = new Scanner(System.in);
        double fnum, snum, answer;
        
        System.out.println("Enter first number: ");
        fnum = steven.nextDouble();
        
        System.out.println("Enter your second number: ");
        snum = steven.nextDouble();
        
        answer = fnum + snum;
        
        System.out.println("Your answer is: " + answer);
    }
    
}
