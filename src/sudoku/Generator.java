/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ruster
 */
public class Generator {

    private ArrayList number = new ArrayList();
    int b[][]= new int[9][9];
    public int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    public int Random1to9_Horizental() {
        int k=0;
        for(int i=0;i<9;i++)
        {
            k=randInt(1, 9);
            //System.out.println(k);
        }
        return k;
    }
    public int Random2to9_Vertical(int exception) {
        int exception_number=0;
        for(int i=0;i<8;i++)
        {
            int k;
            k=randInt(1, 9);
            if(k!=exception)
            {
                exception_number=k;
            }
            //System.out.println(k);
        }
        return exception_number;
    }
    public int Random2to8_Horizental(int exception1,int exception2)
    {
        int exception_number=0;
        for(int i=0;i<7;i++)
        {
            int k;
            k=randInt(1, 9);
            if(k!=exception1 && k!=exception2)
            {
                exception_number=k;
            }
        }
        return exception_number;
    }
    public void Generate_FirstRow()
    {
        int n=0;
        ArrayList a = new ArrayList();
        while(a.size()!=9)
        {
            n=Random1to9_Horizental();
            if(!a.contains(n))
            {
                a.add(n);
            }
        }
//        System.out.println(a);
//        System.out.println(a.size());
        this.setNumber(a);
    }

    public ArrayList getNumber() {
        return number;
    }

    public void setNumber(ArrayList number) {
        this.number = number;
    }
    public void Generate_FirstColumn()
    {
        ArrayList row = this.getNumber();
        
        int getnumber=0;
        
        //In vao mang b tu mang row
        for(int i=0;i<9;i++)
        {
            getnumber = (int) row.get(i);
            b[0][i]=getnumber;
        }
        ArrayList column;
        
        //First column
        for(int i=0;i<row.size();i++)
        {
            int define_numeber = b[0][0];
            int n=0;

            column = new ArrayList();
            while(column.size()!=8)// && cot<10
            {
                n=Random2to9_Vertical(define_numeber);
                if(!column.contains(n))
                {
                    column.add(n);
                }
                for(int j=0;j<column.size();j++)
                {
                    int getcol=0;
                    getcol = (int) column.get(j);
                    b[j+1][0]=getcol;
                }
            }
            //cot++;
//            System.out.println("i"+i);
//            System.out.println("dèine"+define_numeber);
            //System.out.println(cot);
        }
        
        //Last Column
        for(int i=0;i<row.size();i++)
        {
            int define_numeber = b[0][8];
//            System.out.println("b[0][8]: "+define_numeber);
            int n=0;

            column = new ArrayList();
            while(column.size()!=8)// && cot<10
            {
                n=Random2to9_Vertical(define_numeber);
                if(!column.contains(n))
                {
                    column.add(n);
                }
                for(int j=0;j<column.size();j++)
                {
                    int getcol=0;
                    getcol = (int) column.get(j);
                    b[j+1][8]=getcol;
                }
            }
        }
        //Last Row
        for(int i=0;i<row.size();i++)
        {
            int define_number1 = b[8][0];
            int define_number2 = b[8][8];
//            System.out.println("b[8][0]: "+define_number1);
//            System.out.println("b[8][8]: "+define_number2);
            int n=0;

            column = new ArrayList();
            while(column.size()!=8)// && cot<10
            {
                n=Random2to8_Horizental(define_number1,define_number2);
                if(!column.contains(n))
                {
                    column.add(n);
                }
                for(int j=0;j<column.size()-1;j++)
                {
                    int getcol=0;
                    getcol = (int) column.get(j);
                    b[8][j+1]=getcol;
                }
            }
        }
        
        //Xuat mang
        for(int i =0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void Check_First_Col_Row()
    {
        while(b[1][0]==b[0][1] || b[2][0]==b[0][1] || b[1][0]==b[0][2] || b[2][0]==b[0][2] 
           || b[0][6]==b[1][8] || b[0][6]==b[2][8] || b[0][7]==b[1][8] || b[0][7]==b[2][8]
           || b[1][0]==b[1][8] || b[2][0]==b[2][8] || b[3][0]==b[3][8] || b[4][0]==b[4][8]
           || b[5][0]==b[5][8] || b[6][0]==b[6][8] || b[7][0]==b[7][8] || b[8][0]==b[8][8]
           || b[7][0]==b[8][1] || b[7][0]==b[8][2] || b[8][0]==b[8][1] || b[8][0]==b[8][1]  
           || b[8][6]==b[6][8] || b[8][6]==b[7][8] || b[8][7]==b[6][8] || b[8][7]==b[7][8] 
           || b[8][1]==b[0][1] || b[8][2]==b[0][2] || b[8][3]==b[0][3] || b[8][4]==b[0][4] 
           || b[8][5]==b[0][5] || b[8][6]==b[0][6] || b[8][7]==b[0][7]   )
        {
            System.out.println("Khoi tao lai do bi trung");
            Generate_FirstColumn();
        }
    }
    

    public static void main(String[] args) {


        Generator g = new Generator();
        g.Generate_FirstRow();
        g.Check_First_Col_Row();

    }
}
