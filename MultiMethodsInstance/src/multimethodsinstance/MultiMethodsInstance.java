/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimethodsinstance;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class MultiMethodsInstance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna tunaObject = new tuna("Kelsey");
        tuna tunaObject2 = new tuna("YO MAMA");
        
        tunaObject.saying();
        System.out.println();
        tunaObject2.saying();
    }
    
}
