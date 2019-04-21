package com.company.Lesson31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
        public static String rec(char[] s, ArrayList<Character> n){
            StringBuffer sb = new StringBuffer();
            if(s.length == n.size()){
                StringBuffer ans = new StringBuffer();
                for(Character aN: n) ans.append(aN);
                return ans.toString() + " ";
            }
            for(char value: s)
                if(!n.contains(value)){
                    ArrayList<Character> copy = (ArrayList<Character>)n.clone();
                    copy.add(value);
                    sb.append(rec(s, copy));
                }
            return sb.toString();
        }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        ArrayList<Character> chars = new ArrayList<>();
        System.out.println(rec(sc.next().toCharArray(), chars));
        char[] s = sc.next().toCharArray();
        for(int i = 0; i < s.length; i++)
            for(int j = 1; j < s.length; j++){
                for(char c: s) System.out.print(c);
                System.out.print(" ");
                swap(s, j-1, j);
            }
    }
    public static void swap(char[] s, int i, int j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
    }
}
