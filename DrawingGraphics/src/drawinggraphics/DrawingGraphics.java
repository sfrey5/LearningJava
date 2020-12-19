/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawinggraphics;

import javax.swing.JFrame;

/**
 *
 * @author Steven
 */
public class DrawingGraphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Peach p = new Peach();
        
        f.add(p);
        f.setSize(400, 250);
        f.setVisible(true);
    }
    
}
