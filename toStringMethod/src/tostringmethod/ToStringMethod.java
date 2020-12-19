/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringmethod;

/**
 *
 * @author Steven
 */
public class ToStringMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        potpie potObject = new potpie(4,5,6);
        apples appObject = new apples("Steven", potObject);
        
        System.out.println(appObject);
    }
    
}
