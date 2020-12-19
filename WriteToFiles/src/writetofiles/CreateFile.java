/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofiles;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Steven
 */
public class CreateFile {
    private Formatter x;
    
    public void openFile(){
        try{
            x = new Formatter("japan.txt");
        }catch(Exception e){
            System.out.println("You have an error");
        }
    }
    
    public void addRecords(){
        x.format("%s%s%s", "30 ", "steven ", "frey ");
    }
    
    public void closeFile(){
        x.close();
    }
}
