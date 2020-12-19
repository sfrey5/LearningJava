/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagenumberprogram;
import java.util.*;
/**
 *
 * @author Steven
 */
public class AverageNumberProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade, average, counter = 0;
        
        while(counter < 10){
            System.out.println("Enter another number: ");
            grade = input.nextInt();
            total += grade;
            counter++;
        }
        
        average = total/10;
        System.out.println("You're aver is " + average);
    }
    
}
