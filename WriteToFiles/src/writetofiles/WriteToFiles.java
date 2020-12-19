/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofiles;

/**
 *
 * @author Steven
 */
public class WriteToFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CreateFile hello = new CreateFile();
        
        hello.openFile();
        hello.addRecords();
        hello.closeFile();
        
    }
    
}
