/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijframe;
import javax.swing.JFrame;
/**
 *
 * @author Steven
 */
public class GUIJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        tuna bucky = new tuna();
        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bucky.setSize(275, 180);
        bucky.setVisible(true);
    }
    
}
