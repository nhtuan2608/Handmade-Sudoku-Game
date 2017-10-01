/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ruste
 */
public class demo {
    public static void main(String[] args) {
    JButton jb = new JButton("Press Me");

    jb.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent ev) {
        System.out.println("ItemEvent!");
      }
    });

    jb.addChangeListener(new ChangeListener() {
       @Override
        public void stateChanged(ChangeEvent ce) {
            System.out.println("ChangeEvent!");        }
    });

    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(jb);
    f.pack();
    f.setVisible(true);
  }
}
