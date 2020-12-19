/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morestringmethods;

/**
 *
 * @author Steven
 */
public class MoreStringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "stevenfreystevenfrey";
        
        System.out.println(s.indexOf("s", 5));
        
        String a = "Bacon ";
        String b = "Monster";
        
        System.out.println(a.concat(b));
        
        System.out.println(a.replace("B", "F"));
        
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
        
        String f = "                   hello           ";
        System.out.println(f.trim());
        
    }
    
}
