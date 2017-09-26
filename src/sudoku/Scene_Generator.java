/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ruster
 */
public class Scene_Generator {
        private ArrayList number = new ArrayList();
    int b[][]= new int[9][9];
    public int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = min+ rand.nextInt((max - min +1));
        
        return randomNum;
    }
    public int Random1to9_9number(){
        int k=0;
        k=randInt(1, 9);
        //System.out.println("Tao k "+k);
        return k;
    }
    public void Generate_FirstRow()
    {
        int n=0;
        ArrayList a = new ArrayList();
        while(a.size()!=9)
        {
            n=Random1to9_9number();
            if(!a.contains(n))
            {
                a.add(n);
            }
        }
//        System.out.println(a);
//        System.out.println(a.size());
        this.setNumber(a);
    }
        public void Generate()
    {
        ArrayList row = this.getNumber();
        
        int getnumber=0;
        
        //In vao mang b tu mang row
        for(int i=0;i<9;i++)
        {
            getnumber = (int) row.get(i);
            b[0][i]=getnumber;
        }
        int n, num1 = 0, num2=0, num3=0, num4=0, num5=0;
        int num6=0, num7=0, num8=0, num9=0, num10=0, num11=0, num12=0;
        int num13=0, num14=0, num15=0;
        //<editor-fold defaultstate="collapsed" desc="GetnumRow0">
        for(int i=0;i<9;i++)
        {
            getnumber = (int)b[0][i];
            if(i==0)
            {
                num1=getnumber;
            }
            if(i==1)
            {
                num2=getnumber;
            }
            if(i==2)
            {
                num3=getnumber;
            }
            if(i==3)
            {
                num4=getnumber;
            }
            if(i==4)
            {
                num5=getnumber;
            }
            if(i==5)
            {
                num6=getnumber;
            }
            if(i==6)
            {
                num7=getnumber;
            }
            if(i==7)
            {
                num8=getnumber;
            }
            if(i==8)
            {
                num9=getnumber;
            }
        }
//</editor-fold>

        row = new ArrayList();
        row.add(num1);
        row.add(num2);
        row.add(num3);
        
        System.out.println("3 so dau "+row);
        List trung = new ArrayList();
        int getcol=0;
        Integer g[]; 
        g = ShufferArray(row);
        for(int i=0;i<g.length;i++)
        {
            //System.out.println("Shuffed "+g[i]);
            getcol = g[i];
            trung.add(i,getcol);
        }
        
        //System.out.println("trung"+trung);
        for(int k=0;k<3;k++)
        {
            int so = (int) trung.get(k);
            b[1][k]=so;
            //System.out.println("3 o dau: "+b[1][k]);
        }
        
        for(int i =0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public ArrayList getNumber() {
        return number;
    }

    public void setNumber(ArrayList number) {
        this.number = number;
    }
    public Integer[] ShufferArray(ArrayList Scene)
    {
        
        
        // Original array
        Integer[] array = new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        //System.out.println("before: " + Arrays.toString(array));

        // Convert array to list
        List<Integer> list = Arrays.asList(array);
        // And shuffle that list
        Collections.shuffle(list);
        //System.out.println("after as list: " + list);
        while(list.get(0)==Scene.get(0) || list.get(1)==Scene.get(1) || list.get(2)==Scene.get(2)
           || list.get(0)==Scene.get(1) || list.get(0)==Scene.get(2)
           || list.get(1)==Scene.get(2) || list.get(2)==Scene.get(2)    )
        {
            ShufferArray(Scene);
        }
        // (Optional) then convert the list back to an array,
        // and save it in its initial variable (`array` in this case)
        //Integer[] shuffedArray = new Integer[array.size()];
        list.toArray(array);
        //System.out.println("after as array: " + Arrays.toString(shuffedArray));
        return array;
    }
    public static void main(String[] args) {
        Scene_Generator g = new Scene_Generator();
        g.Generate_FirstRow();
        g.Generate();
        
        
  
    }
}
