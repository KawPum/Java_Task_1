package com.company;

public class Main {

    public static void main(String[] args) {
        double number;
        for (int i = 0; i<10;i++){
            if (i == 0) System.out.print(1);
            else{
                number = (double)1/(i+1);
                System.out.format(" %.2f", number);
            }
        }
    }
}
