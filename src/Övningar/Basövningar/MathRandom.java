package Övningar.Basövningar;

public class MathRandom {
    public static void main(String[] args) {

        //Math.random(); ger ett slumpmässigt tal som är >= 0.0 och < 1.0

        //define the range
        int min = 1000;
        int max = 9999;
        int range = max - min +1;
        // range 8999
        // 8999 * 0.9999999 + 1 + 1000 = 9000 + 1000 = 9999.99


        //generate random numbers from min to max
        for (int i=0; i<10; i++){
            int rand = (int) (Math.random() * range) +min;
            System.out.println(rand);
        }

    }
}
