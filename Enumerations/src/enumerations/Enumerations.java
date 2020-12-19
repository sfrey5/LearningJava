/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerations;
import java.util.EnumSet;
/**
 *
 * @author Steven
 */
public class Enumerations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(tuna people : tuna.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        
        System.out.println("\nAnd now for the range of constants\n");
        
        for(tuna people : EnumSet.range(tuna.kelsey, tuna.candy))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }
    
}
