/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimethodsinstance;

/**
 *
 * @author Steven
 */
public class tuna {
    private String girlName;
    
    public tuna(String name){
        girlName = name;
    }
            
    public void setName(String name){
        girlName = name;
    }
    
    public String getName(){
        return girlName;
    }
    
    public void saying(){
        System.out.printf("Your first gf was %s", getName());
    }
    
}
