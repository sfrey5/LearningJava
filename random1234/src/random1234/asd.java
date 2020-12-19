/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random1234;

/**
 *
 * @author Steven
 */

public class InfixToPostFix {
    static int precedence(char c){
        switch (c){
            case '/':
                return 1;
            case '*':
                return 2;
            case '-':
                return 3;
            case '+':
                return 4;
        }
        return -1;
    }
    static String infixToPostFix(String expression){
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length() ; i++) {
            char c = expression.charAt(i);
            //check if char is operator
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }else{
                //character is neither operator nor ( 
                result += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    } 
}
