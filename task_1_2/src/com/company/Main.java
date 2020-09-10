package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        /*String str;
	    for (;;)
        {
            str = sc.nextLine();
            if (str.isEmpty()) break;
            else System.out.println(str);
        }*/

	    /*for (int i = 0; i<10;i++)  //for//
        {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }*/
	    int count = 0;   //while//
	    /*while (count < numbers.length)
        {
            numbers[count] = sc.nextInt();
            sum += numbers[count];
            count++;
        }*/
	    do {
            numbers[count] = sc.nextInt();
            sum += numbers[count];
            count++;
        }
	    while (count < numbers.length);

	    System.out.println(sum);
    }
}
