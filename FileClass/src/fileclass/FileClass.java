/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileclass;
import java.io.*;

/**
 *
 * @author Steven
 */
public class FileClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File x = new File("C:\\test\\greg.txt");
        
        if(x.exists())
            System.out.println(x.getName() + " exists");
        else 
            System.out.println("this doesnt exists");       
    }
    
}
