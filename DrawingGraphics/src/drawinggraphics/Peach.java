/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawinggraphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Steven
 */
public class Peach extends JPanel {
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);
        
        
        g.setColor(new Color(190, 81, 215));
        g.fillRect(25, 65, 100, 30);
        
        g.setColor(Color.PINK);
        g.drawString("This is some text", 25, 120);
    }
}
