package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
	    for (;;)
        {
            str = sc.nextLine();
            if (str.isEmpty()) break;
            else System.out.println(str);
        }
    }
}
