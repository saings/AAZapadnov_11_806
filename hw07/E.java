package com.company;

public class E {
    public static void main(String[] args) {
        int a = 356;
        System.out.println(te(a));
    }
    static int te(int a){
        if(a < 10)
        {
    return a;
        }else
            {
        return a % 10 + te(a / 10);
    }
    }
}