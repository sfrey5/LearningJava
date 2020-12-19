/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerations;

/**
 *
 * @author Steven
 */
public enum tuna {
    steven("nice", "31"),
    kelsey("cute", "28"),
    julia("bigmistake", "25"),
    nicole("italian", "13"),
    candy("different", "14"),
    erin("iwish", "16");
    
    private final String desc;
    private final String year;
    
    tuna(String description, String birthday){
        desc = description;
        year = birthday;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public String getYear(){
        return year;
    }
    
}
