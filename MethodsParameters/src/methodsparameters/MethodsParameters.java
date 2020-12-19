/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsparameters;
import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class MethodsParameters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        tuna tuna = new tuna();
        
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        
        tuna.simpleMessage(name);
    }
    
}
