package com.company.pp;

import java.util.Arrays;
import java.util.Random;

public class Main{
    public static int mainSum = 0;

    public static void main(String[] args) throws InterruptedException{

        Random r = new Random();
        int[] arr = new int[1000];
        for(int i = 0; i < 1000; i++){
            arr[i] = r.nextInt(1000);
        }

        System.out.println(Arrays.stream(arr).sum());
        CounterThread ct = new CounterThread(arr, 0, 250);
        CounterThread ct1 = new CounterThread(arr, 250, 500);
        CounterThread ct2 = new CounterThread(arr, 500, 750);
        CounterThread ct3 = new CounterThread(arr, 750, 1000);
        ct.start();
        ct1.start();
        ct2.start();
        ct3.start();
        while(ct.isAlive() || ct1.isAlive() || ct2.isAlive() || ct3.isAlive());
        System.out.println(mainSum);
    }
}
