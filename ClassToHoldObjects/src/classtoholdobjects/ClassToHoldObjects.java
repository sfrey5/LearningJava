/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtoholdobjects;

/**
 *
 * @author Steven
 */
public class ClassToHoldObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnimalList ALO = new AnimalList();
        
        Dog d = new Dog();
        Fish f = new Fish();
        ALO.add(d);
        ALO.add(f);
        
    }
    
}
