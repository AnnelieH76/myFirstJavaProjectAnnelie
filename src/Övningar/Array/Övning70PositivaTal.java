package Övningar.Array;

import java.util.Arrays;

//En array med 50 inlästa tal finns. Ta reda på och skriv ut maximum och minimum samt hur många tal som är positiva.
public class Övning70PositivaTal {

    public static void main(String[] args) {

        int array[] = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()-0.5) * 1000);
        }
        System.out.println(Arrays.toString(array));
        int max =-500;
        int min = 500;

        int positivCounter =0;

        for (int j : array) {
            if (j > max) max = j;
            if (j < min) min = j;

            if (j >0) positivCounter++;

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(positivCounter);

        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());
    }

}
