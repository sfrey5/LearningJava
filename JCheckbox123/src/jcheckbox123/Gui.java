/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcheckbox123;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Steven
 */
public class Gui extends JFrame{
    private JTextField  tf;
    private JCheckBox  boldbox;
    private JCheckBox italicbox;
   // private JCheckBox underlinebox;
    
    public Gui(){
        super("The title");
        setLayout(new FlowLayout());
        
        tf = new JTextField("This is a sentence", 20);
        tf.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        add(tf);
        
        boldbox = new JCheckBox("Bold:");
        italicbox = new JCheckBox("Italics:");
       // underlinebox = new JCheckBox("Underline:");
        
        add(boldbox);
        add(italicbox);
        //add(underlinebox);
        
        HandlerClass handler = new HandlerClass();
        
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
        //underlinebox.addItemListener(handler);
        
        
        
    }
    
    private class HandlerClass implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            
            if(boldbox.isSelected() && italicbox.isSelected() ){
                font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 14);
            }else if(boldbox.isSelected()){
                font = new Font("Times New Roman", Font.BOLD, 14);
            }else if(italicbox.isSelected()){
                font = new Font("Times New Roman", Font.ITALIC, 14);
            }else
                font = new Font("Times New Roman", Font.PLAIN, 14);
            
            tf.setFont(font);
        }
        
    }
}
