/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterclasses;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Steven
 */
public class Gui extends JFrame {
    private String details;
    private JLabel statusbar;
    
    public Gui(){
        super("The title");
        statusbar = new JLabel("this is default");
        
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());
    }
    
    private class MouseClass extends MouseAdapter{
        
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d", event.getClickCount());
            
            if(event.isMetaDown())
                details += " with right mouse button";
            else if(event.isAltDown())
                details += " with center mouse button";
            else
                details += " with left mouse buttons";
            
            statusbar.setText(details);
            
        }
    }
}
