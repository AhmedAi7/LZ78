/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1.g1.pkg20170008.pkg20170033;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Dict {
   
   public static ArrayList<String> Dictionary = new ArrayList<String>(); 
    Dict()
    {
        Dictionary.add("");
    }
    public static boolean Exist(String word,int [] index) 
    {
        for(int i=0;i<Dictionary.size();i++)
        {
            if (Dictionary.get(i).equals(word))
            {
                index[0]=i;
                return true;
            } 
        }
       return false;
    }
    public static void Print ()
    {
        for (int i=0 ; i<Dictionary.size();i++)
        {
            
            System.out.print(i);
            System.out.print("  ");
            System.out.println(Dictionary.get(i));
        }
    }
    public static void PrintInput ()
    {
        for (int i=0 ; i<Dictionary.size();i++)
        {
            System.out.print(Dictionary.get(i));
        }
    }
    public static void Add (int index,char ch)
    {
        String word;
        word=Dictionary.get(index);
        word=word+ch;
        Dictionary.add(word);
    }
    }
    

