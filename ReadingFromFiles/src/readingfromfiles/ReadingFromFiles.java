/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfromfiles;

/**
 *
 * @author Steven
 */
public class ReadingFromFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        readfile r = new readfile();
        
        r.openFile();
        r.readFile();
        r.closeFile();
    }
    
}
