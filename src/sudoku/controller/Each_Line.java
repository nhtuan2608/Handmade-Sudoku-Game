/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.controller;

/**
 *
 * @author Ruster
 */
public class Each_Line {
    private String cell_1;
    private String cell_2;
    private String cell_3;
    private String cell_4;
    private String cell_5;
    private String cell_6;
    private String cell_7;
    private String cell_8;
    private String cell_9;

    public Each_Line() {
    }

    public Each_Line(String cell_1, String cell_2, String cell_3, String cell_4, String cell_5, String cell_6, String cell_7, String cell_8, String cell_9) {
        this.cell_1 = cell_1;
        this.cell_2 = cell_2;
        this.cell_3 = cell_3;
        this.cell_4 = cell_4;
        this.cell_5 = cell_5;
        this.cell_6 = cell_6;
        this.cell_7 = cell_7;
        this.cell_8 = cell_8;
        this.cell_9 = cell_9;
    }

    public String getCell_1() {
        return cell_1;
    }

    public void setCell_1(String cell_1) {
        this.cell_1 = cell_1;
    }

    public String getCell_2() {
        return cell_2;
    }

    public void setCell_2(String cell_2) {
        this.cell_2 = cell_2;
    }

    public String getCell_3() {
        return cell_3;
    }

    public void setCell_3(String cell_3) {
        this.cell_3 = cell_3;
    }

    public String getCell_4() {
        return cell_4;
    }

    public void setCell_4(String cell_4) {
        this.cell_4 = cell_4;
    }

    public String getCell_5() {
        return cell_5;
    }

    public void setCell_5(String cell_5) {
        this.cell_5 = cell_5;
    }

    public String getCell_6() {
        return cell_6;
    }

    public void setCell_6(String cell_6) {
        this.cell_6 = cell_6;
    }

    public String getCell_7() {
        return cell_7;
    }

    public void setCell_7(String cell_7) {
        this.cell_7 = cell_7;
    }

    public String getCell_8() {
        return cell_8;
    }

    public void setCell_8(String cell_8) {
        this.cell_8 = cell_8;
    }

    public String getCell_9() {
        return cell_9;
    }

    public void setCell_9(String cell_9) {
        this.cell_9 = cell_9;
    }
    
    @Override
    public String toString()
    {
        return this.cell_1+","+this.cell_2+","+this.cell_3+","+this.cell_4+","+this.cell_5+","+this.cell_6
        +","+this.cell_7+","+this.cell_8+","+this.cell_9;
    }
}
