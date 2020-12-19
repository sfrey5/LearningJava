/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathoperators;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class MathOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner steven = new Scanner(System.in);
        int girls, boys, people;
        girls = 7;
        boys = 3;
        
        people = girls % boys;
        System.out.println(people);
    }
    
    
}
