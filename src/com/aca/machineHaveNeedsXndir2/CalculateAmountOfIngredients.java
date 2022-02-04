package com.aca.machineHaveNeedsXndir2;

public class CalculateAmountOfIngredients {

    private final static int Water = 200;
    private final static int MILK = 50;
    private final static int COFFEE = 15;

    public static void calculate(int countOfCoffee) {

        System.out.println("For" + countOfCoffee + "youWillNeed\n" + countOfCoffee * Water + "ml of water\n" + countOfCoffee * MILK + "ml of milk\n" + countOfCoffee * COFFEE + "g of coffee beans");

    }


}
