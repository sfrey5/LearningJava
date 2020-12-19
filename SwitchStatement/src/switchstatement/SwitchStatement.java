/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;

/**
 *
 * @author Steven
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        age = 4;
        
        switch(age){
            case 1: 
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can walk");
                break;
            case 3:
                System.out.println("You can talk");
                break;
            default:
                System.out.println("None of these applied");
                break;
        }
    }
    
}
