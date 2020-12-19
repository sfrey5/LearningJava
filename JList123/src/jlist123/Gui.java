/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlist123;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Steven
 */
public class Gui extends JFrame {
    
    private JList list;
    private static String[] colornames = {"black", "blue", "red", "white"};
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
    
    public Gui(){
        super("The title");
        setLayout(new FlowLayout());
        
        list = new JList(colornames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        add(new JScrollPane(list));
                
        list.addListSelectionListener(
                new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent event){
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                        
                    }
                }
        );
    }
}
