/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementoperators;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class IncrementOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner steven = new Scanner(System.in);
        int tuna = 6;
        int bass = 5;
        System.out.println(tuna++);
        System.out.println(tuna);
        tuna = tuna + bass;
        System.out.println(tuna);
        
        tuna += tuna;
        System.out.println(tuna);

    }
    
}
