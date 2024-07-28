package Creational.builderpattern;

import java.util.Scanner;

// Client code to use the Builder pattern
public class BurgerMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Burger Builder!");
        System.out.print("Enter burger size (Small, Medium, Large): ");
        String size = scanner.nextLine();

        System.out.print("Add cheese? (yes/no): ");
        boolean cheese = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Add pepperoni? (yes/no): ");
        boolean pepperoni = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Add lettuce? (yes/no): ");
        boolean lettuce = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Add tomato? (yes/no): ");
        boolean tomato = scanner.nextLine().equalsIgnoreCase("yes");

        // Use the builder to construct the burger
        Burger burger = new Burger.BurgerBuilder()
                .setSize(size)
                .addCheese(cheese)
                .addPepperoni(pepperoni)
                .addLettuce(lettuce)
                .addTomato(tomato)
                .build();

        // Display the burger's contents
        System.out.println("\nYour custom burger has been created:");
        burger.display();

        scanner.close();
    }
}
