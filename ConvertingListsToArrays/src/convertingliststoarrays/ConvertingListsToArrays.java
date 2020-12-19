/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertingliststoarrays;
import java.util.*;
/**
 *
 * @author Steven
 */
public class ConvertingListsToArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] stuff = {"babies", "watermelon", "laser", "fudge"};
        LinkedList<String> thelist = new LinkedList<>(Arrays.asList(stuff));
        
        thelist.add("pumpkin");
        thelist.addFirst("firstthing");
        
        
        stuff = thelist.toArray(new String[thelist.size()]);
        
        for(String x : stuff){
            System.out.printf("%s ", x);
        }
        
    }
    
}
