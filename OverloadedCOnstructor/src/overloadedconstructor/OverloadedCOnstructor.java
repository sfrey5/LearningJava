/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadedconstructor;

/**
 *
 * @author Steven
 */
public class OverloadedCOnstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Apples appleObject = new Apples();
        Apples appleObject2 = new Apples(5);
        Apples appleObject3 = new Apples(5, 13);
        Apples appleObject4 = new Apples(5, 13, 43);
        
        System.out.printf("%s\n", appleObject.toMilitary());
        System.out.printf("%s\n", appleObject2.toMilitary());
        System.out.printf("%s\n", appleObject3.toMilitary());
        System.out.printf("%s\n", appleObject4.toMilitary());
    }
    
}
