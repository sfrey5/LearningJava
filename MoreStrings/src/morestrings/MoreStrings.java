/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morestrings;

/**
 *
 * @author Steven
 */
public class MoreStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "apples";
        String b = "bucky";
        String c = "BUCKY";
        
        System.out.println(a.length());
        
        if(a.equals("apples")){
            System.out.println("Yes it does");
        }
        
        if(b.equalsIgnoreCase(c))
            System.out.println("TRUE");
    }
    
}
