/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addall;
import java.util.*;
/**
 *
 * @author Steven
 */
public class AddAll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //convert stuff array to a list
        String[] stuff = {"bacon", "apples", "beef", "corn"};
        List<String> list1 = Arrays.asList(stuff);
        
        ArrayList<String> list2 = new ArrayList<>();
        
        list2.add("youtubbe");
        list2.add("google");
        list2.add("digg");
        
        for(String x : list2){
            System.out.printf("%s ", x);
        }
        
        Collections.addAll(list2, stuff);
        
        System.out.println("");
        
        for(String x : list2){
            System.out.printf("%s ", x);
        }
        System.out.println("");
        System.out.println(Collections.frequency(list2, "digg"));
        
        boolean trf = Collections.disjoint(list1, list2);
        System.out.println(trf);
        
        
        if(trf)
            System.out.println("These list have nothing in common");
        else
            System.out.println("these list must have something in common");
        
        
        
             
    }
    
}
