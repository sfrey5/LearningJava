/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
import java.util.*;

/**
 *
 * @author Steven
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PriorityQueue<String> queue = new PriorityQueue<>();
        
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        
        System.out.printf("%s ", queue);
        System.out.println("");
        
        System.out.printf("%s ", queue.peek());
        System.out.println("");
        
        
        queue.poll();
        System.out.printf("%s ", queue);
        System.out.println("");
    }
    
}
