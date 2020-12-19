/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsreverseandcopy;
import java.util.*;


/**
 *
 * @author Steven
 */
public class MethodsReverseAndCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //create an array and conver to a list
        Character[] ray = {'p', 'w', 'n'};
        List<Character> list = Arrays.asList(ray);
        System.out.println("List is: ");    
        output(list);
        
        
        //reverse and print out the list
        Collections.reverse(list);
        System.out.println("After reverse: ");
        output(list);
        
        //create new array and new list
        Character[] newray = new Character[3];
        List<Character> listCopy = Arrays.asList(newray);
        
        //copy contents of list into listCopy
        Collections.copy(listCopy, list);
        System.out.println("Copy of list: ");
        output(listCopy);
        
        //fill collection with list
        Collections.fill(list, 'x');
        System.out.println("After filling the list: ");
        output(list);
        
 
    }
    
    private static void output(List<Character> thelist){
        
        for(Character thing : thelist){
            System.out.printf("%s ", thing);
        }
        System.out.println();
        
    }
    
}
