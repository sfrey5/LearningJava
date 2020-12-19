/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbutton123;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Steven
 */
public class GUI extends JFrame {
    public JButton reg;
    public JButton custom;
    
    public GUI(){
        super("The title");
        setLayout(new FlowLayout());
        
        reg = new JButton("reg button");
        add(reg);
        
        Icon h = new ImageIcon(getClass().getResource("h.png"));
        Icon g = new ImageIcon(getClass().getResource("g.png"));
        custom = new JButton("Custom", h);
        custom.setRolloverIcon(g);
        add(custom);
        
        HandlerClass handler = new HandlerClass();
        
        reg.addActionListener(handler);
        custom.addActionListener(handler);
        
    }
    
    
    private class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }


    }
}
