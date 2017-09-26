/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import Form.Form_Main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sudoku.Sudoku.dsScene;
import static sudoku.Sudoku.dsResult;
/**
 *
 * @author Ruster
 */
public class Load_Data {

    /**
     *
     * @param fileName
     */
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
                    Form_Main.btnSquare68.setText(el.getCell_4());
                    if(!Form_Main.btnSquare68.getText().equals(" "))
                    {
                        Form_Main.btnSquare68.setEnabled(false);
                    }
                    Form_Main.btnSquare69.setText(el.getCell_5());
                    if(!Form_Main.btnSquare69.getText().equals(" "))
                    {
                        Form_Main.btnSquare69.setEnabled(false);
                    }
                    Form_Main.btnSquare70.setText(el.getCell_6());
                    if(!Form_Main.btnSquare70.getText().equals(" "))
                    {
                        Form_Main.btnSquare70.setEnabled(false);
                    }
                    Form_Main.btnSquare71.setText(el.getCell_7());
                    if(!Form_Main.btnSquare71.getText().equals(" "))
                    {
                        Form_Main.btnSquare71.setEnabled(false);
                    }
                    Form_Main.btnSquare72.setText(el.getCell_8());
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
                    Form_Main.btnSquare78.setText(el.getCell_5());
                    if(!Form_Main.btnSquare78.getText().equals(" "))
                    {
                        Form_Main.btnSquare78.setEnabled(false);
                    }
                    Form_Main.btnSquare79.setText(el.getCell_6());
                    if(!Form_Main.btnSquare79.getText().equals(" "))
                    {
                        Form_Main.btnSquare79.setEnabled(false);
                    }
                    Form_Main.btnSquare80.setText(el.getCell_7());
                    if(!Form_Main.btnSquare80.getText().equals(" "))
                    {
                        Form_Main.btnSquare80.setEnabled(false);
                    }
                    Form_Main.btnSquare81.setText(el.getCell_8());
                    if(!Form_Main.btnSquare81.getText().equals(" "))
                    {
                        Form_Main.btnSquare81.setEnabled(false);
                    }
//                    Form_Main.jButton90.setText(el.getCell_9());
//                    if(!Form_Main.jButton90.getText().equals(" "))
//                    {
//                        Form_Main.jButton90.setEnabled(false);
//                    }
                }
                //</editor-fold>
                System.out.println(line);
                line=in.readLine();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Load_Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Load_Data.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Load_Data.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Load_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
