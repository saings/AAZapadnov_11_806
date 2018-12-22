package com.company;

public class J {
    public static boolean bool = true;
    public static void main(String[] args) {
        String s = "asaasa";
        if (t(0, s)) System.out.println("yes");
        else System.out.println("no");
    }
    public static boolean t(int index, String s) {
        if(index < s.length() / 2) {
            if(s.charAt(index) == s.charAt(s.length() - index - 1) && bool)
            {
                t(index += 1, s);
            }else
                {
                bool = false;
            }
        }
        return bool;
    }
}
