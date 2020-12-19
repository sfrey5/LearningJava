/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytable;

/**
 *
 * @author Steven
 */
public class ArrayTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Index\tValue");
        
        int steven[] = {32, 12, 18, 54, 2};
        
        for(int counter = 0; counter < steven.length ; counter++  ){
            System.out.println(counter + "\t" + steven[counter]);
            
        }
    }
    
}
