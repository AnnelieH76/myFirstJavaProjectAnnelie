package Kurs2.TDD.SubClasses;

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        MealHuvudklass[] meals = new MealHuvudklass[5];

        for (int i = 0; i < meals.length; i++) {
            System.out.println("What is your order?");
            String food = scan.nextLine();
            if (food.equals("icecream")) {
                meals[i] = new IceCreamSubClass();
                System.out.println("Do you want sprinkles? Y/N");
                if (scan.nextLine().equals("Y")) {
                    ((IceCreamSubClass) meals[i]).addSprinkles();
                }
            } else {
                meals[i] = new SausageSubClass();
                System.out.println("Do you want ketschup? Y/N");
                if (scan.nextLine().equals("Y")) {
                    ((SausageSubClass) meals[i]).addKetchup();
                }
            }
        }
        for (int i = 0; i < meals.length; i++) {
            meals[i].kindOfFood();
            meals[i].serve();
        }

        int totalPrice = 0;
        for (int i = 0; i < meals.length; i++) {
            totalPrice += meals[i].getPrice();
        }

        System.out.println("The total price is: " + totalPrice);

    }
}

        /*
        SausageSubClass sausage = new SausageSubClass();
        sausage.order();
        sausage.serve();

        MealHuvudklass m = new SausageSubClass();
        m.order();
        m.serve();

        System.out.println();

        MealHuvudklass[] meals = new MealHuvudklass[5];
        meals[0]= new SausageSubClass();
        meals[1]= new IceCreamSubClass();
        meals[2]= new SausageSubClass();
        meals[3]= new IceCreamSubClass();
        meals[4]= new SausageSubClass();

            for (int i = 0; i < meals.length; i++) {
                meals[i].kindOfFood();
                meals[i].serve();
            }

*/


