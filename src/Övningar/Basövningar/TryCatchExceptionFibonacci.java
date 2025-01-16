package Övningar.Basövningar;

import java.util.Scanner;

public class TryCatchExceptionFibonacci {

    public static void main(String[] args) {

        boolean incorrectFibonacci =true;

        while (incorrectFibonacci) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Write a number between 1-40: ");
            try {
                int number = Integer.parseInt(scan.nextLine());
                int[] fibonacci = new int[40];

                fibonacci[0] = 1;
                fibonacci[1] = 1;
                for (int i = 2; i < 40; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
                System.out.println("Number " + number + " corresponds to Fibonacci: " + (fibonacci[number - 1]));
                incorrectFibonacci =false;

            } catch (ArrayIndexOutOfBoundsException e) {
                incorrectFibonacci =true;
                System.out.println("You must write a number >1 and <=40");
            } catch (NumberFormatException e) {
                incorrectFibonacci =true;
                System.out.println("You must write a number between 1-40, not decimals, letters or characters");
            } catch (Exception e) {
                incorrectFibonacci =true;
                System.out.println("You must write a number between 1-40");
            }
        }
    }
}


// Värden som får programmet att krascha: -1, 0, 1.2, 41, #, a, fem, 3.0, endast enter