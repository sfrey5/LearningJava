/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphicprogram;

/**
 *
 * @author Steven
 */
public class PolymorphicProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal[] thelist = new Animal[2];
        
        Dog d = new Dog();
        Fish f = new Fish();
        
        thelist[0] = d;
        thelist[1] = f;
        
        for(Animal x : thelist){
            x.noise();
        }
        
    }
    
}
