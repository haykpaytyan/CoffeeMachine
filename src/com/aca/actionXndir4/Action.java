package com.aca.actionXndir4;

import java.util.Scanner;

public class Action {


    Scanner scanner = new Scanner(System.in);
    private int money = 550;
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;


    protected void printState() {
        System.out.println("money is " + money + "\n" + "water is " + water + "\n" + "milk is " + milk + "\n" + "coffeeBeans is " + coffeeBeans + "\n" + "cups is " + cups + "\n");

    }


    protected void fill(int milk, int water, int coffeeBeans, int cups) {

        this.milk += milk;
        this.water += water;
        this.coffeeBeans += coffeeBeans;
        this.cups += cups;

    }

    protected void take() {
        money = 0;
    }

    protected void buy() {
        System.out.println("choose type of coffee  espresso, latte or cappuccino ");
        String typeOfCoffee = scanner.next();
        if (typeOfCoffee.equals("espresso")) {
            Espresso espresso = new Espresso();
            if (this.water > espresso.getWater() && this.coffeeBeans > espresso.getCoffee() && this.cups > 0) {
                this.water -= espresso.getWater();
                this.coffeeBeans -= espresso.getCoffee();
                --this.cups;
                this.money += espresso.getCost();
                printState();
            } else {
                System.out.println("it can't make a cup of coffee");
                return;
            }

            printState();
        } else if (typeOfCoffee.equals("latte")) {
            Latte latte = new Latte();
            if (this.water > latte.getWater() && this.coffeeBeans > latte.getCoffee() && this.milk > latte.getMilk() && this.cups > 0) {
                this.water -= latte.getWater();
                this.coffeeBeans -= latte.getCoffee();
                this.milk -= latte.getMilk();
                --this.cups;
                printState();

            } else {
                System.out.println("it can't make a cup of coffee");
                return;
            }


        } else if (typeOfCoffee.equals("cappuccino")) {
            Cappuccino cappuccino = new Cappuccino();
            if (this.water > cappuccino.getWater() && this.coffeeBeans > cappuccino.getCoffee() && this.milk > cappuccino.getMilk() && this.cups > 0) {

                this.water -= cappuccino.getWater();
                this.coffeeBeans -= cappuccino.getCoffee();
                --this.cups;
                this.money += cappuccino.getCost();
                this.milk = cappuccino.getMilk();
                printState();
            } else {
                System.out.println("it can't make a cup of coffee");
                return;
            }
        } else {
            System.out.println("Invalid name of Coffee");
        }


    }

    public void choose() {
        System.out.println("choose what you want to do BUY, FILL, or TAKE ");

        String choose = scanner.next();
        if (choose.equalsIgnoreCase("buy")) {

            buy();

        } else if (choose.equalsIgnoreCase("fill")) {
            System.out.println("fill ingredients ");
            int fillWater = scanner.nextInt();
            int fillMilk = scanner.nextInt();
            int fillCoffee = scanner.nextInt();
            int fillCups = scanner.nextInt();
            fill(fillMilk, fillWater, fillCoffee, fillCups);
            printState();
        } else if (choose.equalsIgnoreCase("take")) {
            take();
            printState();
        } else {
            System.out.println("Error Invalid request");

        }


    }
}
