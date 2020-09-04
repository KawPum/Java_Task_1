package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        int n;
        boolean sorted = false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n ; i++){
            //arr.add((int)(Math.random()*100));
            arr.add(random.nextInt(100));
            //System.out.println(arr.get(i));
        }

        for (;n>=1;n--){
            for(int i = 0; i<n-1;i++)
            {
                if (arr.get(i) > arr.get(i+1)){
                    int temp = arr.get(i);
                    arr.set(i,arr.get(i+1));
                    arr.set(i+1,temp);
                }
            }
        }

        for (int i = 0; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }
    }
}
