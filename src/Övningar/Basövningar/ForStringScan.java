package Övningar.Basövningar;

import java.util.Scanner;

public class ForStringScan

    {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();

            if(text.equals("ägg"))
            {
                System.out.println("ägg är knasigt");
            }
            else
                for(int i=0; i<text.length(); i++)
                    {
                        System.out.print(text.charAt(i));
                    }

        }

    }


