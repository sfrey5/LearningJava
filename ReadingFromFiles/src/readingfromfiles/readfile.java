/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfromfiles;
import java.io.*;
import java.util.*;

/**
 *
 * @author Steven
 */
public class readfile {
    private Scanner x;
    
    public void openFile(){
        try{
            x = new Scanner(new File("chinese.txt"));
        }catch(Exception e){
            System.out.println("Could not find file.");
        }
    }
    
    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();
            
            System.out.printf("%s %s %s\n", a, b, c);
        }
    }
    
    public void closeFile(){
        x.close();
    }
}
