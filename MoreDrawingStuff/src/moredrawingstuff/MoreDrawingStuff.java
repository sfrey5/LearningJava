/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moredrawingstuff;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Steven
 */
public class MoreDrawingStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Title");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Peach p = new Peach();
        p.setBackground(Color.WHITE);
        j.add(p);
        j.setSize(500, 270);
        j.setVisible(true);
        
    }
    
}
