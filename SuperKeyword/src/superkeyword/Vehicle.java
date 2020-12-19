/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superkeyword;

/**
 *
 * @author Steven
 */
public class Vehicle {
    int maxSpeed;
    
    Vehicle(){
        System.out.println("Vehicle constructor");
    }
    
    Vehicle(int maxSpeed){
        System.out.println("Vehicle constructor");
        this.maxSpeed = maxSpeed;
    }
}
    



class Car extends Vehicle {
    
    int maxSpeed;
    
    Car(){
        super();
        
        
    }
}