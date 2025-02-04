package Kurs2.TDD.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        ArrayList<Integer> fibonacci = new ArrayList<>();// ArrayList med dynamisk storlek.

        fibonacci.add(1);
        fibonacci.add(1);
        for (int i = 2; i < number; i++) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
        }
        System.out.println(fibonacci.get(number - 1));
    }
}

/*
int number = Integer.parseInt(scan.nextLine());
int[] fibonacci = new int[10]; //10 st Fibonaccital i en Array
fibonacci[0]=1;
fibonacci[1]=1;
        for(
int i = 2;
i<fibonacci.length;i++){
fibonacci[i]=fibonacci[i -1]+fibonacci[i -2];
        }
        System.out.println(fibonacci[number-1]);

 */