/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleselectionlist;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Steven
 */
public class Gui extends JFrame {
    
    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private String[] foods = {"bacon", "wings", "pizza", "ham", "beef"};
    
    public Gui(){
        super("The title");
        setLayout(new FlowLayout());
        
        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));
        
        movebutton = new JButton("Move -->");
        movebutton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        rightlist.setListData(leftlist.getSelectedValues());
                        
                    }
                }
        );
        add(movebutton);
        
        
        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellHeight(15);
        rightlist.setFixedCellWidth(100);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
        
        
        
    }
    
    
}
