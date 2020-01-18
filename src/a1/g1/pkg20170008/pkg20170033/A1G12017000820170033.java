/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1.g1.pkg20170008.pkg20170033;

import static a1.g1.pkg20170008.pkg20170033.Dict.Dictionary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
public class A1G12017000820170033 {

    /**
     * @param args the command line arguments
     */
    public static void Comp(Dict D,ArrayList<Character> Tags_ch,ArrayList<Integer> Tags_index)
    {
        System.out.println("Enter text you want to Compression:");
        Scanner input = new Scanner(System.in);
        String Word = input.next();
        String Sub ="";
        int[] Index= new int [1];
        Index[0]=0;
        for (int i=0; i<Word.length();i++)
        {
            Sub =Sub+Character.toString(Word.charAt(i));
            if (!D.Exist(Sub,Index))
            {
                D.Add(Index[0],Word.charAt(i));
                Sub= "";
                Tags_index.add(Index[0]);
                Tags_ch.add(Word.charAt(i));
                Index[0]=0;
            }
            if(D.Exist(Sub,Index) && i==Word.length()-1 &&Sub != "")
            {
                Tags_index.add(0);
                Tags_ch.add(Word.charAt(i));
            }
        }
    }
    public static void DeComp(Dict D,ArrayList<Character> Tags_ch,ArrayList<Integer> Tags_index)
    {
        while (true)
        {
        System.out.println("Enter Index: ");
        Scanner input = new Scanner(System.in);
        int index=input.nextInt();
        System.out.println("Enter Character: ");
        char ch=input.next().charAt(0);
        Tags_index.add(index);
        Tags_ch.add(ch);
        System.out.println("Add more? y/n");
        char choice=input.next().charAt(0);
        if (choice=='n')
            break;
        }
        for(int i =0;i<Tags_index.size();i++)
            D.Add(Tags_index.get(i), Tags_ch.get(i));
    }
    public static void main(String[] args) {
    ArrayList<Character> Tags_ch = new ArrayList<Character>();
    ArrayList<Integer> Tags_index = new ArrayList<Integer>();
    Dict D = new Dict();
    System.out.println("1-Compress");
    System.out.println("2-Decompress");
    Scanner input = new Scanner(System.in);
    int Choice =input.nextInt();
    if (Choice==1)
        Comp(D,Tags_ch,Tags_index);
    else if (Choice==2)
        DeComp(D,Tags_ch,Tags_index);
    System.out.println("Your Input:");
    D.PrintInput();
    System.out.println(" ");
    System.out.println("Tags:");
    for(int i=0;i<Tags_index.size();i++)
        System.out.println("<"+Tags_index.get(i)+ "," +Tags_ch.get(i)+">");    
    System.out.println(" ");
    System.out.println("Dectionary:");
    D.Print();
    System.out.println(" ");
     Tags_ch.clear();
     Tags_index.clear();
    D.Dictionary.clear( );
}
}
