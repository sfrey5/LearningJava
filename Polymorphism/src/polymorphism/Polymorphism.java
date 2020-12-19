/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Steven
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        food steven[] = new food[3];
        
        steven[0] = new potpie();
        steven[1] = new tuna();
        
        for(int x = 0; x <= 2; ++x){
            steven[x].eat();
        }
        
        
        fatty steven1 = new fatty();
        
        food po = new potpie();
        
        steven1.digest(po);
        
        
    }
    
}
