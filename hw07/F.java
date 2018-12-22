package com.company;

public class F {
    public static void main(String[] args) {
        int p = 165;
        t(p);
    }
    static void t(int p){
        if (p < 10){
            System.out.print(p + " ");
            return;
        }else{
            int l = p % 10;
            System.out.print(l + " ");
            t(p / 10);
        }
    }
}
