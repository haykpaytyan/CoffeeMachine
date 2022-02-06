package com.aca.enoughCoffeeXndir3;

import java.util.Scanner;

public class EnoughCoffee {

    private final int water = 200;
    private final int milk = 50;
    private final int coffee = 15;


    public void ifWeHaveEnoughSupplies() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int wwater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mmilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int ccoffee = scanner.nextInt();
        System.out.println("Wrtie how many cups of coffee you will need");
        int countOfCoffee = scanner.nextInt();
        if (wwater >= water * countOfCoffee && mmilk >= milk * countOfCoffee && ccoffee >= coffee * countOfCoffee) {

            if (wwater < water * (countOfCoffee + 1) || mmilk < milk * (countOfCoffee + 1) || ccoffee < coffee * (countOfCoffee + 1)) {
                System.out.println("Yes, I can make that amount of coffee\n");
            } else {

                int remainWater = (wwater - water * countOfCoffee) / water;
                int remainMilk = (mmilk - milk * countOfCoffee) / milk;
                int remainCoffee = (ccoffee - coffee * countOfCoffee) / coffee;

                int n = Math.min(remainCoffee, Math.min(remainMilk, remainWater));

                System.out.println("Yes, I can make that amount of coffee (and even " + n + " more than that)\n");

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

