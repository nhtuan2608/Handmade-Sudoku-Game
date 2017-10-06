/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ruste
 */
public abstract class DisabledButton implements ActionListener{
    private static boolean disabled = false;

    public static void setDisabled(boolean disabled){
        DisabledButton.disabled  = disabled;
    }

    @Override
    public final void actionPerformed(ActionEvent e){

        if(disabled)
            return;

    }
}
