/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedliststuff;
import java.util.*;

/**
 *
 * @author Steven
 */
public class LinkedListStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] things = {"apples", "noobs", "pwnage", "bacon", "Goats"};
        List<String> list1 = new LinkedList<>();
        
        for(String x: things)
            list1.add(x);
        
        
        String[] things2 = {"saugsage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<>();
        
        for(String y : things2)
            list2.add(y);
        
        list1.addAll(list2);
        
        list2 = null;
        
        printMe(list1);
        removeStuff(list1, 2,5);
        printMe(list1);
        reverseMe(list1);
        
        
    }
    
    
    //print me method
    private static void printMe(List<String> l){
        for(String b : l){
            System.out.printf("%s ", b);
            
        }
        System.out.println("");
    }
    
    //removeStuff method
    private static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear();
    }
    
    //reverseMe 
    private static void reverseMe(List<String> l){
        ListIterator<String> steven = l.listIterator(l.size());
        
        while(steven.hasPrevious()){
            System.out.printf("%s ", steven.previous());
        }
    }
    
}
