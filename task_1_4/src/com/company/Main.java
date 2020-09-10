package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int Factorial(int number){
        /*if (number>1) return number* Factorial(number-1);
        else return 1;*/
        int result = 1;
        for (int n = number;n>1;n--){
            result*=n;
        }
        return result;
    }

    public static void main(String[] args) {
        /* Пункт 7: создание массива рандомных чисел и его сортировка
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        int n;
        boolean sorted = false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n ; i++){
            //arr.add((int)(Math.random()*100));
            arr.add(random.nextInt(100));
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("\n");

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
            System.out.print(arr.get(i) + " ");
        }*/

        System.out.println(Factorial(5));
    }


}
