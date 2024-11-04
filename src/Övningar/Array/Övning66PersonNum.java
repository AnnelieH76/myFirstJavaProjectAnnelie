package Övningar.Array;

public class Övning66PersonNum

{
    public static void main(String[] args) {

        String[] personnummer = {"19730120-1638"};

        String personNum = personnummer[0];


        if (personNum.length() == 13 && personNum.charAt(8) == '-')
        {
            System.out.println("Ditt personnummer är: " + personNum);
        }
        else
        {
            System.out.println("Fel format");
        }
    }
}

