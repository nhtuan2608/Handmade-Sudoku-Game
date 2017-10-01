/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

//import static sudoku.Load_Data.Check;
import view.Form_Menu;
import java.util.List;
import static view.Form_Menu.num_scene;
/**
 *
 * @author Ruster
 */
public class Sudoku {

    public static List dsScene;
    public static List dsCheck;
    public  static List dsResult;
    
    public static void main(String[] args) {
        Form_Menu menu = new Form_Menu();
        menu.setVisible(true);
        
        if(num_scene!=0)
        {
            menu.setVisible(false);
        }
    }
    
}
