package com.aca.oncoffeeloopXndir5;

import com.aca.actionXndir4.Action;

import java.util.Scanner;

public class OnCoffeeLoop extends Action {

    Scanner scanner = new Scanner(System.in);


    @Override
    public void choose() {
        System.out.println("choose what you want to do BUY, FILL, TAKE,  EXIT, REMAINING ");
        String choose = scanner.next();
        if (choose.equalsIgnoreCase("buy")) {

            System.out.println("If you whant to return back enter BACK otherwise enter  somthing else");
            String back = scanner.next();
            if (back.equalsIgnoreCase("back")) {
                choose();
            } else {
                buy();
                choose();
            }

        } else if (choose.equalsIgnoreCase("fill")) {
            System.out.println("fill ingredients ");
            int fillWater = scanner.nextInt();
            int fillMilk = scanner.nextInt();
            int fillCoffee = scanner.nextInt();
            int fillCups = scanner.nextInt();
            fill(fillMilk, fillWater, fillCoffee, fillCups);
            printState();
            choose();

        } else if (choose.equalsIgnoreCase("take")) {
            take();
            printState();
            choose();

        } else if (choose.equalsIgnoreCase("exit")) {

            System.exit(0);
        } else if (choose.equalsIgnoreCase("remaining")) {
            printState();
            choose();

        } else {
            System.out.println("Error Invalid request");
            choose();

        }

    }
}
