/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayelementsascounters;
import java.util.Random;
/**
 *
 * @author Steven
 */
public class ArrayElementsAsCounters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int freq[] = new int[7];
        
        for(int roll = 1; roll < 1000; roll++){
            ++freq[1+rand.nextInt(6)];
        }
        
        System.out.println("Face\tFrequency");
        
        for(int face = 1; face < freq.length ; face++){
            System.out.println(face+"\t"+freq[face]);
        }
    }
    
}
