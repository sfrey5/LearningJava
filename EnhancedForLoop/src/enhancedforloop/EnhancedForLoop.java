/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedforloop;

/**
 *
 * @author Steven
 */
public class EnhancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int steven[] = {3,4,5,6,7};
        int total = 0;
        
        for(int x : steven){
            total+= x;
        }
        
        System.out.println("The total is: " + total);
    }
    
}
