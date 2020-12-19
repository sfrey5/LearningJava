/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackspushpop;
import java.util.*;

/**
 *
 * @author Steven
 */
public class StacksPushPop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> stack = new Stack<>();
        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);
        
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        
    }
    
    private static void printStack(Stack<String> s){
        if(s.isEmpty()){
            System.out.println("Your stack is empty");
        }else {
            System.out.printf("%s TOP\n", s);
        }
        
    }
    
}
