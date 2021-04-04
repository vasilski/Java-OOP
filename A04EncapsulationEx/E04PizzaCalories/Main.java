package A04EncapsulationEx.E04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputPizza = scan.nextLine().split("\\s+");

        Pizza pizza = new Pizza(inputPizza[1],Integer.parseInt(inputPizza[2]));

        String[] doughInput = scan.nextLine().split("\\s+");

        Dough dough = new Dough(doughInput[1],doughInput[2],Double.parseDouble(doughInput[3]));

        pizza.setDough(dough);

        String input;

        while(!"END".equals(input=scan.nextLine())){

            String[] topping = input.split("\\s+");

            pizza.addTopping(new Topping(topping[1],Double.parseDouble(topping[2])));

        }
        System.out.println(pizza.getOverallCalories());
    }
    }

