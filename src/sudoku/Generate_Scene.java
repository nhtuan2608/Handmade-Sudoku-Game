/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Ruster
 */
public class Generate_Scene {
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
    public int Random1to9_3number(int exception,int exception1,int exception2 ) {
        int result =0;
        int exception_number = 0;
        
        Random randomTheRest = new Random();
        Set set = new HashSet();
        set.add(exception);
        set.add(exception1);
        set.add(exception2);
        
        
//        for(int i=0;i<8;i++)
//        {
            int k;
            k=randInt(1, 9);
            while(k!=exception && k!=exception1 && k!=exception2 && k!=0)
            {
                exception_number=k;
            }
            //result = exception_number;
            System.out.println("result "+exception_number);
//        }
        return exception_number;
    }
    public int Random1to9_6number(int exception,int exception1,int exception2,int exception3,int exception4,int exception5 ) {
        int exception_number=0;
//        for(int i=0;i<8;i++)
//        {
            int k;
            k=randInt(1, 9);
            if(k!=exception && k!=exception1 && k!=exception2 && k!=exception3 && k!=exception4 && k!=exception5 && k!=0)
            {
                exception_number=k;
            }
//        }
        System.out.println("ex: "+exception_number);
        return exception_number;
    }
//    public int Random1to9_9number(int exception,int exception1,int exception2,int exception3,int exception4,int exception5,int exception6,int exception7,int exception8 ) {
//        int exception_number=0;
//        for(int i=0;i<8;i++)
//        {
//            int k;
//            k=randInt(1, 9);
//            if(k!=exception && k!=exception1 && k!=exception2 && k!=exception3 && k!=exception4 && k!=exception5 && k!=exception6 && k!=exception7 && k!=exception8 && k!=0)
//            {
//                exception_number=k;
//                break;
//            }
//        }
//        return exception_number;
//    }
    
    
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
        
        //<editor-fold defaultstate="collapsed" desc="dong1_3 so dau">
        row = new ArrayList();
        while(row.size()!=6)
        {
            n=Random1to9_3number(num1, num2, num3);
            if(!row.contains(n))
            {
                row.add(n);
            }
        }
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
        
        num10=b[1][0];
        num11=b[1][1];
        num12=b[1][2];
//</editor-fold>

//        //<editor-fold defaultstate="collapsed" desc="dong1_3 so ke">
//        //System.out.println("n4= "+num4+" ,n5= "+num5+" ,n6= "+num6+" ,n10= "+num10+" ,n11= "+num11+" ,n12= "+num12);
//        row = new ArrayList();
//        while(row.size()!=3)
//        {
//
//            n=Random1to9_6number(num4,num5,num6, num10, num11,num12);
//            if(!row.contains(n))
//            {
//                row.add(n);
//            }
//        }
//        System.out.println("row"+row);
//        trung = new ArrayList();
//        g = ShufferArray(row);
//        for(int i=0;i<g.length;i++)
//        {
//            //System.out.println("Shuffed "+g[i]);
//            getcol = g[i];
//            trung.add(i,getcol);
//        }
//
//        //System.out.println("trung"+trung);
//        for(int k=3;k<6;k++)
//        {
//            int so = 0;
//            int i=0;
//            while(i<3)
//            {
//                so = (int) trung.get(i);
//                //System.out.println("so"+so);
//                b[1][k]=so;
//                //System.out.println("3 o sau: "+b[1][k]);
//                i++;
//                k++;
//            }
//        }
//        num13=b[1][3];
//        num14=b[1][4];
//        num15=b[1][5];
////</editor-fold>
        
        
        
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
    public Integer[] ShufferArray(ArrayList array)
    {
        // Original array
        //Integer[] array = new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        //System.out.println("before: " + Arrays.toString(array));

        // Convert array to list
        List<Integer> list = array;
        // And shuffle that list
        Collections.shuffle(list);
        //System.out.println("after as list: " + list);

        // (Optional) then convert the list back to an array,
        // and save it in its initial variable (`array` in this case)
        Integer[] shuffedArray = new Integer[array.size()];
        list.toArray(shuffedArray);
        //System.out.println("after as array: " + Arrays.toString(shuffedArray));
        return shuffedArray;
    }
    public static void main(String[] args) {
        Generate_Scene g = new Generate_Scene();
        g.Generate_FirstRow();
        g.Generate();
       
        
        
  
    }
}
