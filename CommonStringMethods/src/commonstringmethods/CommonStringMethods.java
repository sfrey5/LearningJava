/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonstringmethods;

/**
 *
 * @author Steven
 */
public class CommonStringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] words = {"funk", "chunk", "furry", "baconator"};
        
        //starts with method
        
        for(String w : words){
            if(w.startsWith("fu"))
                System.out.println(w + " starts with fu");
        }
        
        System.out.println("");
        System.out.println("");
        
        for(String w : words){
            if(w.endsWith("unk"))
                System.out.println(w + " ends with unk");
        }
    }
    
}
