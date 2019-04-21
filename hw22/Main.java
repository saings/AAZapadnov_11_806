package ru.kpfu.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      File povest = new File("text.txt");
        Scanner sc;
        Map<String, Integer> map = new Map<>();
        try{
            sc = new Scanner(povest);
            while(sc.hasNext()){
                String str = sc.next();
                str = str.replaceAll("[^а-яА-Я]", "");
                str = str.toLowerCase();
               if(map.get(str) != null){
                    map.put(str, map.get(str) + 1);
                } else{
                    map.put(str, 1);
                }
            }

        } catch(FileNotFoundException error){
            System.out.println(error.getMessage());     }
      System.out.println(map.toString());
    }
}
