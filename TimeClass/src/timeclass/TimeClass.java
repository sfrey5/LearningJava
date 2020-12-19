/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeclass;
import java.util.*;
/**
 *
 * @author Steven
 */
public class TimeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna tuna = new tuna();
        System.out.println(tuna.toMilitary());
        System.out.println(tuna.toRegular());
        tuna.setTime(13,55,8);
        System.out.println();
        System.out.println(tuna.toMilitary());
        
        System.out.println(tuna.toRegular());
        
    }
    
    
}
