package com.aca.enoughCoffeeXndir3;

import java.util.Scanner;

public class EnoughCoffee {

    private final int water = 200;
    private final int milk = 50;
    private final int coffee = 15;


    public void ifWeHaveEnoughSupplies(int countOfCoffee) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("amount of water");
        int wwater = scanner.nextInt();
        System.out.println("amount of milk");
        int mmilk = scanner.nextInt();
        System.out.println("amount of coffee");

        int ccoffee = scanner.nextInt();

        if (wwater >= water * countOfCoffee && mmilk >= milk * countOfCoffee && ccoffee >= coffee * countOfCoffee) {

            if (wwater < water * (countOfCoffee + 1) || mmilk < milk * (countOfCoffee + 1) || ccoffee < coffee * (countOfCoffee + 1)) {
                System.out.println("Yes, I can make that amount of coffee\n");
            } else {

                int remainWater = (wwater - water * countOfCoffee) / countOfCoffee;
                int remainMilk = (wwater - milk * countOfCoffee) / countOfCoffee;
                int remainCoffee = (wwater - coffee * countOfCoffee) / countOfCoffee;

                int n = Math.min(remainCoffee, Math.min(remainMilk, remainWater));

                System.out.println("Yes, I can make that amount of coffee end even more" + n + "more coffee\n");

            }

        } else {

            int nWater = wwater / water;
            int nMilk = mmilk / milk;
            int nCoffee = ccoffee / coffee;

            int n = Math.min(nWater, Math.min(nMilk, nCoffee));
            System.out.println("NO I can make only " + n + "  of coffee");
        }
    }
}

