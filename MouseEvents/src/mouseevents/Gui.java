/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseevents;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

/**
 *
 * @author Steven
 */
public class Gui extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;
    
    public Gui(){
        super("The title");
        
        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);
        
        statusbar = new JLabel("Default");
        add(statusbar, BorderLayout.SOUTH);
        
        HandlerClass handler = new HandlerClass();
        
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }
    
    private class HandlerClass implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent event){
            statusbar.setText(String.format("clicked at %d,%d", event.getX(), event.getY()));
        }
        
        @Override
        public void mousePressed(MouseEvent event){
            statusbar.setText("you pressed down the mouse.");
        }
        
        @Override
        public void mouseReleased(MouseEvent event){
            statusbar.setText("you released the button");
        }
        
        @Override
        public void mouseEntered(MouseEvent event){
            statusbar.setText("You entered the area");
            mousepanel.setBackground(Color.BLUE);
        }
        
        @Override
        public void mouseExited(MouseEvent event){
            statusbar.setText("You left the area");
            mousepanel.setBackground(Color.WHITE);
        }
        
        //these are mouse motion events
        @Override
        public void mouseDragged(MouseEvent event){
            statusbar.setText("You are dragging the mouse");
        }
        
        @Override
        public void mouseMoved(MouseEvent event){
            statusbar.setText("You are moving the mouse");
            
        }
    }
    
}
