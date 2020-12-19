/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergenerator;
import java.util.Random;

/**
 *
 * @author Steven
 */
public class RandomNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random dice = new Random();
        int number;
        
        for(int i = 1; i <= 10; i++){
            number = 1 + dice.nextInt(6);
            System.out.println(number);
        }
    }
    
}
