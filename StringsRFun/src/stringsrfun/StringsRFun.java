/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsrfun;

/**
 *
 * @author Steven
 */
public class StringsRFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = new String("lemur");
        String b = new String("lemur");
        
        if(a==b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        System.out.println(a.equals(b));
    }
    
}
