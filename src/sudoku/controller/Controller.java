/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.controller;

import java.awt.Color;
import view.Form_Main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sudoku.Sudoku.dsResult;
import static sudoku.Sudoku.dsScene;
import static view.Form_Menu.fileCheck;
import static view.Form_Main.btnSquare1;
import static view.Form_Main.btnSquare10;
import static view.Form_Main.btnSquare11;
import static view.Form_Main.btnSquare13;
import static view.Form_Main.btnSquare14;
import static view.Form_Main.btnSquare15;
import static view.Form_Main.btnSquare16;
import static view.Form_Main.btnSquare17;
import static view.Form_Main.btnSquare18;
import static view.Form_Main.btnSquare2;
import static view.Form_Main.btnSquare20;
import static view.Form_Main.btnSquare21;
import static view.Form_Main.btnSquare22;
import static view.Form_Main.btnSquare23;
import static view.Form_Main.btnSquare24;
import static view.Form_Main.btnSquare25;
import static view.Form_Main.btnSquare26;
import static view.Form_Main.btnSquare27;
import static view.Form_Main.btnSquare28;
import static view.Form_Main.btnSquare29;
import static view.Form_Main.btnSquare3;
import static view.Form_Main.btnSquare30;
import static view.Form_Main.btnSquare31;
import static view.Form_Main.btnSquare32;
import static view.Form_Main.btnSquare33;
import static view.Form_Main.btnSquare34;
import static view.Form_Main.btnSquare35;
import static view.Form_Main.btnSquare36;
import static view.Form_Main.btnSquare37;
import static view.Form_Main.btnSquare38;
import static view.Form_Main.btnSquare39;
import static view.Form_Main.btnSquare4;
import static view.Form_Main.btnSquare40;
import static view.Form_Main.btnSquare41;
import static view.Form_Main.btnSquare42;
import static view.Form_Main.btnSquare43;
import static view.Form_Main.btnSquare44;
import static view.Form_Main.btnSquare45;
import static view.Form_Main.btnSquare46;
import static view.Form_Main.btnSquare47;
import static view.Form_Main.btnSquare48;
import static view.Form_Main.btnSquare49;
import static view.Form_Main.btnSquare5;
import static view.Form_Main.btnSquare50;
import static view.Form_Main.btnSquare51;
import static view.Form_Main.btnSquare52;
import static view.Form_Main.btnSquare53;
import static view.Form_Main.btnSquare54;
import static view.Form_Main.btnSquare55;
import static view.Form_Main.btnSquare56;
import static view.Form_Main.btnSquare57;
import static view.Form_Main.btnSquare58;
import static view.Form_Main.btnSquare59;
import static view.Form_Main.btnSquare6;
import static view.Form_Main.btnSquare60;
import static view.Form_Main.btnSquare61;
import static view.Form_Main.btnSquare62;
import static view.Form_Main.btnSquare63;
import static view.Form_Main.btnSquare64;
import static view.Form_Main.btnSquare65;
import static view.Form_Main.btnSquare66;
import static view.Form_Main.btnSquare67;
import static view.Form_Main.btnSquare68;
import static view.Form_Main.btnSquare69;
import static view.Form_Main.btnSquare7;
import static view.Form_Main.btnSquare70;
import static view.Form_Main.btnSquare71;
import static view.Form_Main.btnSquare72;
import static view.Form_Main.btnSquare73;
import static view.Form_Main.btnSquare74;
import static view.Form_Main.btnSquare75;
import static view.Form_Main.btnSquare76;
import static view.Form_Main.btnSquare77;
import static view.Form_Main.btnSquare78;
import static view.Form_Main.btnSquare79;
import static view.Form_Main.btnSquare8;
import static view.Form_Main.btnSquare80;
import static view.Form_Main.btnSquare81;
import static view.Form_Main.btnSquare9;
import static view.Form_Main.btnSquare19;
import static view.Form_Main.btnSquare12;
/**
 *
 * @author Ruster
 */
public class Controller extends DisabledButton{
    
    
    
    public static int isFalse;
    public static void LoadScene(String fileName)
    {   
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String line = in.readLine();

            dsScene = new ArrayList();
            Each_Line el ;
            int count = 0;
            while(null!= line)
            {
                count ++;
                String []split = line.split("-");
                if(true)
                {
                    el= new Each_Line();
                    el.setCell_1(split[1]);
                    el.setCell_2(split[2]);
                    el.setCell_3(split[3]);
                    el.setCell_4(split[4]);
                    el.setCell_5(split[5]);
                    el.setCell_6(split[6]);
                    el.setCell_7(split[7]);
                    el.setCell_8(split[8]);
                    el.setCell_9(split[9]);
                    dsScene.add(el);
                }
            
                //<editor-fold defaultstate="collapsed" desc="count=1">
                if(count==1)
                {
                    Form_Main.btnSquare1.setText(el.getCell_1());
                    if(!Form_Main.btnSquare1.getText().equals(" "))
                    {
                        Form_Main.btnSquare1.setEnabled(false);
                    }
                    Form_Main.btnSquare2.setText(el.getCell_2());
                    if(!Form_Main.btnSquare2.getText().equals(" "))
                    {
                        Form_Main.btnSquare2.setEnabled(false);
                    }
                    Form_Main.btnSquare3.setText(el.getCell_3());
                    if(!Form_Main.btnSquare3.getText().equals(" "))
                    {
                        Form_Main.btnSquare3.setEnabled(false);
                    }
                    Form_Main.btnSquare4.setText(el.getCell_4());
                    if(!Form_Main.btnSquare4.getText().equals(" "))
                    {
                        Form_Main.btnSquare4.setEnabled(false);
                    }
                    Form_Main.btnSquare5.setText(el.getCell_5());
                    if(!Form_Main.btnSquare5.getText().equals(" "))
                    {
                        Form_Main.btnSquare5.setEnabled(false);
                    }
                    Form_Main.btnSquare6.setText(el.getCell_6());
                    if(!Form_Main.btnSquare6.getText().equals(" "))
                    {
                        Form_Main.btnSquare6.setEnabled(false);
                    }
                    Form_Main.btnSquare7.setText(el.getCell_7());
                    if(!Form_Main.btnSquare7.getText().equals(" "))
                    {
                        Form_Main.btnSquare7.setEnabled(false);
                    }
                    Form_Main.btnSquare8.setText(el.getCell_8());
                    if(!Form_Main.btnSquare8.getText().equals(" "))
                    {
                        Form_Main.btnSquare8.setEnabled(false);
                    }
                    Form_Main.btnSquare9.setText(el.getCell_9());
                    if(!Form_Main.btnSquare9.getText().equals(" "))
                    {
                        Form_Main.btnSquare9.setEnabled(false);
                    }
                }
                //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=2">
                if(count==2)
                {
                    Form_Main.btnSquare10.setText(el.getCell_1());
                    if(!Form_Main.btnSquare10.getText().equals(" "))
                    {
                        Form_Main.btnSquare10.setEnabled(false);
                    }
                    Form_Main.btnSquare11.setText(el.getCell_2());
                    if(!Form_Main.btnSquare11.getText().equals(" "))
                    {
                        Form_Main.btnSquare11.setEnabled(false);
                    }
                    Form_Main.btnSquare12.setText(el.getCell_3());
                    if(!Form_Main.btnSquare12.getText().equals(" "))
                    {
                        Form_Main.btnSquare12.setEnabled(false);
                    }
                    Form_Main.btnSquare13.setText(el.getCell_4());
                    if(!Form_Main.btnSquare13.getText().equals(" "))
                    {
                        Form_Main.btnSquare13.setEnabled(false);
                    }
                    Form_Main.btnSquare14.setText(el.getCell_5());
                    if(!Form_Main.btnSquare14.getText().equals(" "))
                    {
                        Form_Main.btnSquare14.setEnabled(false);
                    }
                    Form_Main.btnSquare15.setText(el.getCell_6());
                    if(!Form_Main.btnSquare15.getText().equals(" "))
                    {
                        Form_Main.btnSquare15.setEnabled(false);
                    }
                    Form_Main.btnSquare16.setText(el.getCell_7());
                    if(!Form_Main.btnSquare16.getText().equals(" "))
                    {
                        Form_Main.btnSquare16.setEnabled(false);
                    }
                    Form_Main.btnSquare17.setText(el.getCell_8());
                    if(!Form_Main.btnSquare17.getText().equals(" "))
                    {
                        Form_Main.btnSquare17.setEnabled(false);
                    }
                    Form_Main.btnSquare18.setText(el.getCell_9());
                    if(!Form_Main.btnSquare18.getText().equals(" "))
                    {
                        Form_Main.btnSquare18.setEnabled(false);
                    }
                }
    //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=3">
                if(count == 3)
                {
                    Form_Main.btnSquare19.setText(el.getCell_1());
                    if(!Form_Main.btnSquare19.getText().equals(" "))
                    {
                        Form_Main.btnSquare19.setEnabled(false);
                    }
                    Form_Main.btnSquare20.setText(el.getCell_2());
                    if(!Form_Main.btnSquare20.getText().equals(" "))
                    {
                        Form_Main.btnSquare20.setEnabled(false);
                    }
                    Form_Main.btnSquare21.setText(el.getCell_3());
                    if(!Form_Main.btnSquare21.getText().equals(" "))
                    {
                        Form_Main.btnSquare21.setEnabled(false);
                    }
                    Form_Main.btnSquare22.setText(el.getCell_4());
                    if(!Form_Main.btnSquare22.getText().equals(" "))
                    {
                        Form_Main.btnSquare22.setEnabled(false);
                    }
                    Form_Main.btnSquare23.setText(el.getCell_5());
                    if(!Form_Main.btnSquare23.getText().equals(" "))
                    {
                        Form_Main.btnSquare23.setEnabled(false);
                    }
                    Form_Main.btnSquare24.setText(el.getCell_6());
                    if(!Form_Main.btnSquare24.getText().equals(" "))
                    {
                        Form_Main.btnSquare24.setEnabled(false);
                    }
                    Form_Main.btnSquare25.setText(el.getCell_7());
                    if(!Form_Main.btnSquare25.getText().equals(" "))
                    {
                        Form_Main.btnSquare25.setEnabled(false);
                    }
                    Form_Main.btnSquare26.setText(el.getCell_8());
                    if(!Form_Main.btnSquare26.getText().equals(" "))
                    {
                        Form_Main.btnSquare26.setEnabled(false);
                    }
                    Form_Main.btnSquare27.setText(el.getCell_9());
                    if(!Form_Main.btnSquare27.getText().equals(" "))
                    {
                        Form_Main.btnSquare27.setEnabled(false);
                    }
                }
                //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=4">
                if(count ==4)
                {
                    Form_Main.btnSquare28.setText(el.getCell_1());
                    if(!Form_Main.btnSquare28.getText().equals(" "))
                    {
                        Form_Main.btnSquare28.setEnabled(false);
                    }
                    Form_Main.btnSquare29.setText(el.getCell_2());
                    if(!Form_Main.btnSquare29.getText().equals(" "))
                    {
                        Form_Main.btnSquare29.setEnabled(false);
                    }
                    Form_Main.btnSquare30.setText(el.getCell_3());
                    if(!Form_Main.btnSquare30.getText().equals(" "))
                    {
                        Form_Main.btnSquare30.setEnabled(false);
                    }
                    Form_Main.btnSquare31.setText(el.getCell_4());
                    if(!Form_Main.btnSquare31.getText().equals(" "))
                    {
                        Form_Main.btnSquare31.setEnabled(false);
                    }
                    Form_Main.btnSquare32.setText(el.getCell_5());
                    if(!Form_Main.btnSquare32.getText().equals(" "))
                    {
                        Form_Main.btnSquare32.setEnabled(false);
                    }
                    Form_Main.btnSquare33.setText(el.getCell_6());
                    if(!Form_Main.btnSquare33.getText().equals(" "))
                    {
                        Form_Main.btnSquare33.setEnabled(false);
                    }
                    Form_Main.btnSquare34.setText(el.getCell_7());
                    if(!Form_Main.btnSquare34.getText().equals(" "))
                    {
                        Form_Main.btnSquare34.setEnabled(false);
                    }
                    Form_Main.btnSquare35.setText(el.getCell_8());
                    if(!Form_Main.btnSquare35.getText().equals(" "))
                    {
                        Form_Main.btnSquare35.setEnabled(false);
                    }
                    Form_Main.btnSquare36.setText(el.getCell_9());
                    if(!Form_Main.btnSquare36.getText().equals(" "))
                    {
                        Form_Main.btnSquare36.setEnabled(false);
                    }
                }
    //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=5">
                if(count ==5)
                {
                    Form_Main.btnSquare37.setText(el.getCell_1());
                    if(!Form_Main.btnSquare37.getText().equals(" "))
                    {
                        Form_Main.btnSquare37.setEnabled(false);
                    }
                    Form_Main.btnSquare38.setText(el.getCell_2());
                    if(!Form_Main.btnSquare38.getText().equals(" "))
                    {
                        Form_Main.btnSquare38.setEnabled(false);
                    }
                    Form_Main.btnSquare39.setText(el.getCell_3());
                    if(!Form_Main.btnSquare39.getText().equals(" "))
                    {
                        Form_Main.btnSquare39.setEnabled(false);
                    }
                    Form_Main.btnSquare40.setText(el.getCell_4());
                    if(!Form_Main.btnSquare40.getText().equals(" "))
                    {
                        Form_Main.btnSquare40.setEnabled(false);
                    }
                    Form_Main.btnSquare41.setText(el.getCell_5());
                    if(!Form_Main.btnSquare41.getText().equals(" "))
                    {
                        Form_Main.btnSquare41.setEnabled(false);
                    }
                    Form_Main.btnSquare42.setText(el.getCell_6());
                    if(!Form_Main.btnSquare42.getText().equals(" "))
                    {
                        Form_Main.btnSquare42.setEnabled(false);
                    }
                    Form_Main.btnSquare43.setText(el.getCell_7());
                    if(!Form_Main.btnSquare43.getText().equals(" "))
                    {
                        Form_Main.btnSquare43.setEnabled(false);
                    }
                    Form_Main.btnSquare44.setText(el.getCell_8());
                    if(!Form_Main.btnSquare44.getText().equals(" "))
                    {
                        Form_Main.btnSquare44.setEnabled(false);
                    }
                    Form_Main.btnSquare45.setText(el.getCell_9());
                    if(!Form_Main.btnSquare45.getText().equals(" "))
                    {
                        Form_Main.btnSquare45.setEnabled(false);
                    }
                }
                //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=6">
                if(count ==6)
                {
                    Form_Main.btnSquare46.setText(el.getCell_1());
                    if(!Form_Main.btnSquare46.getText().equals(" "))
                    {
                        Form_Main.btnSquare46.setEnabled(false);
                    }
                    Form_Main.btnSquare47.setText(el.getCell_2());
                    if(!Form_Main.btnSquare47.getText().equals(" "))
                    {
                        Form_Main.btnSquare47.setEnabled(false);
                    }
                    Form_Main.btnSquare48.setText(el.getCell_3());
                    if(!Form_Main.btnSquare48.getText().equals(" "))
                    {
                        Form_Main.btnSquare48.setEnabled(false);
                    }
                    Form_Main.btnSquare49.setText(el.getCell_4());
                    if(!Form_Main.btnSquare49.getText().equals(" "))
                    {
                        Form_Main.btnSquare49.setEnabled(false);
                    }
                    Form_Main.btnSquare50.setText(el.getCell_5());
                    if(!Form_Main.btnSquare50.getText().equals(" "))
                    {
                        Form_Main.btnSquare50.setEnabled(false);
                    }
                    Form_Main.btnSquare51.setText(el.getCell_6());
                    if(!Form_Main.btnSquare51.getText().equals(" "))
                    {
                        Form_Main.btnSquare51.setEnabled(false);
                    }
                    Form_Main.btnSquare52.setText(el.getCell_7());
                    if(!Form_Main.btnSquare52.getText().equals(" "))
                    {
                        Form_Main.btnSquare52.setEnabled(false);
                    }
                    Form_Main.btnSquare53.setText(el.getCell_8());
                    if(!Form_Main.btnSquare53.getText().equals(" "))
                    {
                        Form_Main.btnSquare53.setEnabled(false);
                    }
                    Form_Main.btnSquare54.setText(el.getCell_9());
                    if(!Form_Main.btnSquare54.getText().equals(" "))
                    {
                        Form_Main.btnSquare54.setEnabled(false);
                    }
                }
    //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=7">
                if(count == 7)
                {
                    Form_Main.btnSquare55.setText(el.getCell_1());
                    if(!Form_Main.btnSquare55.getText().equals(" "))
                    {
                        Form_Main.btnSquare55.setEnabled(false);
                    }
                    Form_Main.btnSquare56.setText(el.getCell_2());
                    if(!Form_Main.btnSquare56.getText().equals(" "))
                    {
                        Form_Main.btnSquare56.setEnabled(false);
                    }
                    Form_Main.btnSquare57.setText(el.getCell_3());
                    if(!Form_Main.btnSquare57.getText().equals(" "))
                    {
                        Form_Main.btnSquare57.setEnabled(false);
                    }
                    Form_Main.btnSquare58.setText(el.getCell_4());
                    if(!Form_Main.btnSquare58.getText().equals(" "))
                    {
                        Form_Main.btnSquare58.setEnabled(false);
                    }
                    Form_Main.btnSquare59.setText(el.getCell_5());
                    if(!Form_Main.btnSquare59.getText().equals(" "))
                    {
                        Form_Main.btnSquare59.setEnabled(false);
                    }
                    Form_Main.btnSquare60.setText(el.getCell_6());
                    if(!Form_Main.btnSquare60.getText().equals(" "))
                    {
                        Form_Main.btnSquare60.setEnabled(false);
                    }
                    Form_Main.btnSquare61.setText(el.getCell_7());
                    if(!Form_Main.btnSquare61.getText().equals(" "))
                    {
                        Form_Main.btnSquare61.setEnabled(false);
                    }
                    Form_Main.btnSquare62.setText(el.getCell_8());
                    if(!Form_Main.btnSquare62.getText().equals(" "))
                    {
                        Form_Main.btnSquare62.setEnabled(false);
                    }
                    Form_Main.btnSquare63.setText(el.getCell_9());
                    if(!Form_Main.btnSquare63.getText().equals(" "))
                    {
                        Form_Main.btnSquare63.setEnabled(false);
                    }
                }
                //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=8">
                if(count == 8)
                {
                    Form_Main.btnSquare64.setText(el.getCell_1());
                    if(!Form_Main.btnSquare64.getText().equals(" "))
                    {
                        Form_Main.btnSquare64.setEnabled(false);
                    }
                    Form_Main.btnSquare65.setText(el.getCell_2());
                    if(!Form_Main.btnSquare65.getText().equals(" "))
                    {
                        Form_Main.btnSquare65.setEnabled(false);
                    }
                    Form_Main.btnSquare66.setText(el.getCell_3());
                    if(!Form_Main.btnSquare66.getText().equals(" "))
                    {
                        Form_Main.btnSquare66.setEnabled(false);
                    }
                    Form_Main.btnSquare67.setText(el.getCell_4());
                    if(!Form_Main.btnSquare67.getText().equals(" "))
                    {
                        Form_Main.btnSquare67.setEnabled(false);
                    }
                    Form_Main.btnSquare68.setText(el.getCell_5());
                    if(!Form_Main.btnSquare68.getText().equals(" "))
                    {
                        Form_Main.btnSquare68.setEnabled(false);
                    }
                    Form_Main.btnSquare69.setText(el.getCell_6());
                    if(!Form_Main.btnSquare69.getText().equals(" "))
                    {
                        Form_Main.btnSquare69.setEnabled(false);
                    }
                    Form_Main.btnSquare70.setText(el.getCell_7());
                    if(!Form_Main.btnSquare70.getText().equals(" "))
                    {
                        Form_Main.btnSquare70.setEnabled(false);
                    }
                    Form_Main.btnSquare71.setText(el.getCell_8());
                    if(!Form_Main.btnSquare71.getText().equals(" "))
                    {
                        Form_Main.btnSquare71.setEnabled(false);
                    }
                    Form_Main.btnSquare72.setText(el.getCell_9());
                    if(!Form_Main.btnSquare72.getText().equals(" "))
                    {
                        Form_Main.btnSquare72.setEnabled(false);
                    }
                }
    //</editor-fold>

                //<editor-fold defaultstate="collapsed" desc="count=9">
                if(count==9)
                {
                    Form_Main.btnSquare73.setText(el.getCell_1());
                    if(!Form_Main.btnSquare73.getText().equals(" "))
                    {
                        Form_Main.btnSquare73.setEnabled(false);
                    }
                    Form_Main.btnSquare74.setText(el.getCell_2());
                    if(!Form_Main.btnSquare74.getText().equals(" "))
                    {
                        Form_Main.btnSquare74.setEnabled(false);
                    }
                    Form_Main.btnSquare75.setText(el.getCell_3());
                    if(!Form_Main.btnSquare75.getText().equals(" "))
                    {
                        Form_Main.btnSquare75.setEnabled(false);
                    }
                    Form_Main.btnSquare76.setText(el.getCell_4());
                    if(!Form_Main.btnSquare76.getText().equals(" "))
                    {
                        Form_Main.btnSquare76.setEnabled(false);
                    }
                    Form_Main.btnSquare77.setText(el.getCell_5());
                    if(!Form_Main.btnSquare77.getText().equals(" "))
                    {
                        Form_Main.btnSquare77.setEnabled(false);
                    }
                    Form_Main.btnSquare78.setText(el.getCell_6());
                    if(!Form_Main.btnSquare78.getText().equals(" "))
                    {
                        Form_Main.btnSquare78.setEnabled(false);
                    }
                    Form_Main.btnSquare79.setText(el.getCell_7());
                    if(!Form_Main.btnSquare79.getText().equals(" "))
                    {
                        Form_Main.btnSquare79.setEnabled(false);
                    }
                    Form_Main.btnSquare80.setText(el.getCell_8());
                    if(!Form_Main.btnSquare80.getText().equals(" "))
                    {
                        Form_Main.btnSquare80.setEnabled(false);
                    }
                    Form_Main.btnSquare81.setText(el.getCell_9());
                    if(!Form_Main.btnSquare81.getText().equals(" "))
                    {
                        Form_Main.btnSquare81.setEnabled(false);
                    }
                }
                //</editor-fold>
                System.out.println(line);
                line=in.readLine();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    public static void LoadResult(String fileName)
    {
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String line = in.readLine();

            dsResult = new ArrayList();
            Each_Line el ;
            while(null!= line)
            {
                String []split = line.split("-");
                if(true)
                {
                    el= new Each_Line();
                    el.setCell_1(split[1]);
                    el.setCell_2(split[2]);
                    el.setCell_3(split[3]);
                    el.setCell_4(split[4]);
                    el.setCell_5(split[5]);
                    el.setCell_6(split[6]);
                    el.setCell_7(split[7]);
                    el.setCell_8(split[8]);
                    el.setCell_9(split[9]);
                    dsResult.add(el);
                }
                System.out.println(line);
                line=in.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void CheckResult()
    {
                    BufferedReader in;
            try {
                in = new BufferedReader(new FileReader(fileCheck));
                String line = in.readLine();

                dsResult = new ArrayList();
                Each_Line el ;
                int count=0;
                while(null!= line)
                {
                    count++;
                    String []split = line.split("-");
                    if(true)
                    {
                        el= new Each_Line();
                        el.setCell_1(split[1]);
                        el.setCell_2(split[2]);
                        el.setCell_3(split[3]);
                        el.setCell_4(split[4]);
                        el.setCell_5(split[5]);
                        el.setCell_6(split[6]);
                        el.setCell_7(split[7]);
                        el.setCell_8(split[8]);
                        el.setCell_9(split[9]);
                        dsResult.add(el);
                    }
                    //<editor-fold defaultstate="collapsed" desc="count = 1">
                    if(count==1)
                    {
                        if(!btnSquare1.getText().equals(el.getCell_1()))
                        {btnSquare1.setBackground(Color.RED);}
                        else{
                            if(btnSquare1.isEnabled())
                            {
                                btnSquare1.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare2.getText().equals(el.getCell_2()))
                        {btnSquare2.setBackground(Color.RED);}
                        else{
                            if(btnSquare2.isEnabled())
                            {
                                btnSquare2.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare3.getText().equals(el.getCell_3()))
                        {btnSquare3.setBackground(Color.RED);}
                        else{
                            if(btnSquare3.isEnabled())
                            {
                                btnSquare3.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare4.getText().equals(el.getCell_4()))
                        {btnSquare4.setBackground(Color.RED);}
                        else{
                            if(btnSquare4.isEnabled())
                            {
                                btnSquare4.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare5.getText().equals(el.getCell_5()))
                        {btnSquare5.setBackground(Color.RED);}
                        else{
                            if(btnSquare5.isEnabled())
                            {
                                btnSquare5.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare6.getText().equals(el.getCell_6()))
                        {btnSquare6.setBackground(Color.RED);}
                        else{
                            if(btnSquare6.isEnabled())
                            {
                                btnSquare6.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare7.getText().equals(el.getCell_7()))
                        {btnSquare7.setBackground(Color.RED);}
                        else{
                            if(btnSquare7.isEnabled())
                            {
                                btnSquare7.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare8.getText().equals(el.getCell_8()))
                        {btnSquare8.setBackground(Color.RED);}
                        else{
                            if(btnSquare8.isEnabled())
                            {
                                btnSquare8.setBackground(Color.GREEN);
                            }
                        }

                        if(!btnSquare9.getText().equals(el.getCell_9()))
                        {btnSquare9.setBackground(Color.RED);}
                        else{
                            if(btnSquare9.isEnabled())
                            {
                                btnSquare9.setBackground(Color.GREEN);
                            }
                        }
                    }
    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 2">
                    if(count == 2)
                    {
                        if(!btnSquare10.getText().equals(el.getCell_1()))
                        {btnSquare10.setBackground(Color.RED);}
                        else{
                            if(btnSquare10.isEnabled())
                            {
                                btnSquare10.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare11.getText().equals(el.getCell_2()))
                        {btnSquare11.setBackground(Color.RED);}
                        else{
                            if(btnSquare11.isEnabled())
                            {
                                btnSquare11.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare12.getText().equals(el.getCell_3()))
                        {btnSquare12.setBackground(Color.RED);}
                        else{
                            if(btnSquare12.isEnabled())
                            {
                                btnSquare12.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare13.getText().equals(el.getCell_4()))
                        {btnSquare13.setBackground(Color.RED);}
                        else{
                            if(btnSquare13.isEnabled())
                            {
                                btnSquare13.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare14.getText().equals(el.getCell_5()))
                        {btnSquare14.setBackground(Color.RED);}
                        else{
                            if(btnSquare14.isEnabled())
                            {
                                btnSquare14.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare15.getText().equals(el.getCell_6()))
                        {btnSquare15.setBackground(Color.RED);}
                        else{
                            if(btnSquare15.isEnabled())
                            {
                                btnSquare15.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare16.getText().equals(el.getCell_7()))
                        {btnSquare16.setBackground(Color.RED);}
                        else{
                            if(btnSquare16.isEnabled())
                            {
                                btnSquare16.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare17.getText().equals(el.getCell_8()))
                        {btnSquare17.setBackground(Color.RED);}
                        else{
                            if(btnSquare17.isEnabled())
                            {
                                btnSquare17.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare18.getText().equals(el.getCell_9()))
                        {btnSquare18.setBackground(Color.RED);}
                        else{
                            if(btnSquare18.isEnabled())
                            {
                                btnSquare18.setBackground(Color.GREEN);
                            }
                        }
                    }
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 3">
                    if(count ==3)
                    {
                        if(!btnSquare19.getText().equals(el.getCell_1()))
                        {btnSquare19.setBackground(Color.RED);}
                        else{
                            if(btnSquare19.isEnabled())
                            {
                                btnSquare19.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare20.getText().equals(el.getCell_2()))
                        {btnSquare20.setBackground(Color.RED);}
                        else{
                            if(btnSquare20.isEnabled())
                            {
                                btnSquare20.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare21.getText().equals(el.getCell_3()))
                        {btnSquare21.setBackground(Color.RED);}
                        else{
                            if(btnSquare21.isEnabled())
                            {
                                btnSquare21.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare22.getText().equals(el.getCell_4()))
                        {btnSquare22.setBackground(Color.RED);}
                        else{
                            if(btnSquare22.isEnabled())
                            {
                                btnSquare22.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare23.getText().equals(el.getCell_5()))
                        {btnSquare23.setBackground(Color.RED);}
                        else{
                            if(btnSquare23.isEnabled())
                            {
                                btnSquare23.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare24.getText().equals(el.getCell_6()))
                        {btnSquare24.setBackground(Color.RED);}
                        else{
                            if(btnSquare24.isEnabled())
                            {
                                btnSquare24.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare25.getText().equals(el.getCell_7()))
                        {btnSquare25.setBackground(Color.RED);}
                        else{
                            if(btnSquare25.isEnabled())
                            {
                                btnSquare25.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare26.getText().equals(el.getCell_8()))
                        {btnSquare26.setBackground(Color.RED);}
                        else{
                            if(btnSquare26.isEnabled())
                            {
                                btnSquare26.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare27.getText().equals(el.getCell_9()))
                        {btnSquare27.setBackground(Color.RED);}
                        else{
                            if(btnSquare27.isEnabled())
                            {
                                btnSquare27.setBackground(Color.GREEN);
                            }
                        }
                    }
    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 4">
                    if(count ==4)
                    {
                        if(!btnSquare28.getText().equals(el.getCell_1()))
                        {btnSquare28.setBackground(Color.RED);}
                        else{
                            if(btnSquare28.isEnabled())
                            {
                                btnSquare28.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare29.getText().equals(el.getCell_2()))
                        {btnSquare29.setBackground(Color.RED);}
                        else{
                            if(btnSquare29.isEnabled())
                            {
                                btnSquare29.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare30.getText().equals(el.getCell_3()))
                        {btnSquare30.setBackground(Color.RED);}
                        else{
                            if(btnSquare30.isEnabled())
                            {
                                btnSquare30.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare31.getText().equals(el.getCell_4()))
                        {btnSquare31.setBackground(Color.RED);}
                        else{
                            if(btnSquare31.isEnabled())
                            {
                                btnSquare31.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare32.getText().equals(el.getCell_5()))
                        {btnSquare32.setBackground(Color.RED);}
                        else{
                            if(btnSquare32.isEnabled())
                            {
                                btnSquare32.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare33.getText().equals(el.getCell_6()))
                        {btnSquare33.setBackground(Color.RED);}
                        else{
                            if(btnSquare33.isEnabled())
                            {
                                btnSquare33.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare34.getText().equals(el.getCell_7()))
                        {btnSquare34.setBackground(Color.RED);}
                        else{
                            if(btnSquare34.isEnabled())
                            {
                                btnSquare34.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare35.getText().equals(el.getCell_8()))
                        {btnSquare35.setBackground(Color.RED);}
                        else{
                            if(btnSquare35.isEnabled())
                            {
                                btnSquare35.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare36.getText().equals(el.getCell_9()))
                        {btnSquare36.setBackground(Color.RED);}
                        else{
                            if(btnSquare36.isEnabled())
                            {
                                btnSquare36.setBackground(Color.GREEN);
                            }
                        }
                    }
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 5">
                    if(count == 5)
                    {
                        if(!btnSquare37.getText().equals(el.getCell_1()))
                        {btnSquare37.setBackground(Color.RED);}
                        else{
                            if(btnSquare37.isEnabled())
                            {
                                btnSquare37.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare38.getText().equals(el.getCell_2()))
                        {btnSquare38.setBackground(Color.RED);}
                        else{
                            if(btnSquare38.isEnabled())
                            {
                                btnSquare38.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare39.getText().equals(el.getCell_3()))
                        {btnSquare39.setBackground(Color.RED);}
                        else{
                            if(btnSquare39.isEnabled())
                            {
                                btnSquare39.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare40.getText().equals(el.getCell_4()))
                        {btnSquare40.setBackground(Color.RED);}
                        else{
                            if(btnSquare40.isEnabled())
                            {
                                btnSquare40.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare41.getText().equals(el.getCell_5()))
                        {btnSquare41.setBackground(Color.RED);}
                        else{
                            if(btnSquare41.isEnabled())
                            {
                                btnSquare41.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare42.getText().equals(el.getCell_6()))
                        {btnSquare42.setBackground(Color.RED);}
                        else{
                            if(btnSquare42.isEnabled())
                            {
                                btnSquare42.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare43.getText().equals(el.getCell_7()))
                        {btnSquare43.setBackground(Color.RED);}
                        else{
                            if(btnSquare43.isEnabled())
                            {
                                btnSquare43.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare44.getText().equals(el.getCell_8()))
                        {btnSquare44.setBackground(Color.RED);}
                        else{
                            if(btnSquare44.isEnabled())
                            {
                                btnSquare44.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare45.getText().equals(el.getCell_9()))
                        {btnSquare45.setBackground(Color.RED);}
                        else{
                            if(btnSquare45.isEnabled())
                            {
                                btnSquare45.setBackground(Color.GREEN);
                            }
                        }
                    }
    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 6">
                    if(count ==6)
                    {
                        if(!btnSquare46.getText().equals(el.getCell_1()))
                        {btnSquare46.setBackground(Color.RED);}
                        else{
                            if(btnSquare46.isEnabled())
                            {
                                btnSquare46.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare47.getText().equals(el.getCell_2()))
                        {btnSquare47.setBackground(Color.RED);}
                        else{
                            if(btnSquare47.isEnabled())
                            {
                                btnSquare47.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare48.getText().equals(el.getCell_3()))
                        {btnSquare48.setBackground(Color.RED);}
                        else{
                            if(btnSquare48.isEnabled())
                            {
                                btnSquare48.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare49.getText().equals(el.getCell_4()))
                        {btnSquare49.setBackground(Color.RED);}
                        else{
                            if(btnSquare49.isEnabled())
                            {
                                btnSquare49.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare50.getText().equals(el.getCell_5()))
                        {btnSquare50.setBackground(Color.RED);}
                        else{
                            if(btnSquare50.isEnabled())
                            {
                                btnSquare50.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare51.getText().equals(el.getCell_6()))
                        {btnSquare51.setBackground(Color.RED);}
                        else{
                            if(btnSquare51.isEnabled())
                            {
                                btnSquare51.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare52.getText().equals(el.getCell_7()))
                        {btnSquare52.setBackground(Color.RED);}
                        else{
                            if(btnSquare52.isEnabled())
                            {
                                btnSquare52.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare53.getText().equals(el.getCell_8()))
                        {btnSquare53.setBackground(Color.RED);}
                        else{
                            if(btnSquare53.isEnabled())
                            {
                                btnSquare53.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare54.getText().equals(el.getCell_9()))
                        {btnSquare54.setBackground(Color.RED);}
                        else{
                            if(btnSquare54.isEnabled())
                            {
                                btnSquare54.setBackground(Color.GREEN);
                            }
                        }
                    }
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 7">
                    if(count == 7)
                    {
                        if(!btnSquare55.getText().equals(el.getCell_1()))
                        {btnSquare55.setBackground(Color.RED);}
                        else{
                            if(btnSquare55.isEnabled())
                            {
                                btnSquare55.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare56.getText().equals(el.getCell_2()))
                        {btnSquare56.setBackground(Color.RED);}
                        else{
                            if(btnSquare56.isEnabled())
                            {
                                btnSquare56.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare57.getText().equals(el.getCell_3()))
                        {btnSquare57.setBackground(Color.RED);}
                        else{
                            if(btnSquare57.isEnabled())
                            {
                                btnSquare57.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare58.getText().equals(el.getCell_4()))
                        {btnSquare58.setBackground(Color.RED);}
                        else{
                            if(btnSquare58.isEnabled())
                            {
                                btnSquare58.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare59.getText().equals(el.getCell_5()))
                        {btnSquare59.setBackground(Color.RED);}
                        else{
                            if(btnSquare59.isEnabled())
                            {
                                btnSquare59.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare60.getText().equals(el.getCell_6()))
                        {btnSquare60.setBackground(Color.RED);}
                        else{
                            if(btnSquare60.isEnabled())
                            {
                                btnSquare60.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare61.getText().equals(el.getCell_7()))
                        {btnSquare61.setBackground(Color.RED);}
                        else{
                            if(btnSquare61.isEnabled())
                            {
                                btnSquare61.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare62.getText().equals(el.getCell_8()))
                        {btnSquare62.setBackground(Color.RED);}
                        else{
                            if(btnSquare62.isEnabled())
                            {
                                btnSquare62.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare63.getText().equals(el.getCell_9()))
                        {btnSquare63.setBackground(Color.RED);}
                        else{
                            if(btnSquare63.isEnabled())
                            {
                                btnSquare63.setBackground(Color.GREEN);
                            }
                        }
                    }
    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 8">
                    if(count ==8 )
                    {
                        if(!btnSquare64.getText().equals(el.getCell_1()))
                        {btnSquare64.setBackground(Color.RED);}
                        else{
                            if(btnSquare64.isEnabled())
                            {
                                btnSquare64.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare65.getText().equals(el.getCell_2()))
                        {btnSquare65.setBackground(Color.RED);}
                        else{
                            if(btnSquare65.isEnabled())
                            {
                                btnSquare65.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare66.getText().equals(el.getCell_3()))
                        {btnSquare66.setBackground(Color.RED);}
                        else{
                            if(btnSquare66.isEnabled())
                            {
                                btnSquare66.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare67.getText().equals(el.getCell_4()))
                        {btnSquare67.setBackground(Color.RED);}
                        else{
                            if(btnSquare67.isEnabled())
                            {
                                btnSquare67.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare68.getText().equals(el.getCell_5()))
                        {btnSquare68.setBackground(Color.RED);}
                        else{
                            if(btnSquare68.isEnabled())
                            {
                                btnSquare68.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare69.getText().equals(el.getCell_6()))
                        {btnSquare69.setBackground(Color.RED);}
                        else{
                            if(btnSquare69.isEnabled())
                            {
                                btnSquare69.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare70.getText().equals(el.getCell_7()))
                        {btnSquare70.setBackground(Color.RED);}
                        else{
                            if(btnSquare70.isEnabled())
                            {
                                btnSquare70.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare71.getText().equals(el.getCell_8()))
                        {btnSquare71.setBackground(Color.RED);}
                        else{
                            if(btnSquare71.isEnabled())
                            {
                                btnSquare71.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare72.getText().equals(el.getCell_9()))
                        {btnSquare72.setBackground(Color.RED);}
                        else{
                            if(btnSquare72.isEnabled())
                            {
                                btnSquare72.setBackground(Color.GREEN);
                            }
                        }
                    }
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc="count = 9">
                    if(count == 9)
                    {
                        if(!btnSquare73.getText().equals(el.getCell_1()))
                        {btnSquare73.setBackground(Color.RED);}
                        else{
                            if(btnSquare73.isEnabled())
                            {
                                btnSquare73.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare74.getText().equals(el.getCell_2()))
                        {btnSquare74.setBackground(Color.RED);}
                        else{
                            if(btnSquare74.isEnabled())
                            {
                                btnSquare74.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare75.getText().equals(el.getCell_3()))
                        {btnSquare75.setBackground(Color.RED);}
                        else{
                            if(btnSquare75.isEnabled())
                            {
                                btnSquare75.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare76.getText().equals(el.getCell_4()))
                        {btnSquare76.setBackground(Color.RED);}
                        else{
                            if(btnSquare76.isEnabled())
                            {
                                btnSquare76.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare77.getText().equals(el.getCell_5()))
                        {btnSquare77.setBackground(Color.RED);}
                        else{
                            if(btnSquare77.isEnabled())
                            {
                                btnSquare77.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare78.getText().equals(el.getCell_6()))
                        {btnSquare78.setBackground(Color.RED);}
                        else{
                            if(btnSquare78.isEnabled())
                            {
                                btnSquare78.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare79.getText().equals(el.getCell_7()))
                        {btnSquare79.setBackground(Color.RED);}
                        else{
                            if(btnSquare79.isEnabled())
                            {
                                btnSquare79.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare80.getText().equals(el.getCell_8()))
                        {btnSquare80.setBackground(Color.RED);}
                        else{
                            if(btnSquare80.isEnabled())
                            {
                                btnSquare80.setBackground(Color.GREEN);
                            }
                        }
                        if(!btnSquare81.getText().equals(el.getCell_9()))
                        {btnSquare81.setBackground(Color.RED);}
                        else{
                            if(btnSquare81.isEnabled())
                            {
                                btnSquare81.setBackground(Color.GREEN);
                            }
                        }
                    }
    //</editor-fold>
                    System.out.println(line);
                    line=in.readLine();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
