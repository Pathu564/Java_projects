package Structural.decorator;

import java.util.Scanner;

// Client code
public class MovieTicketShop {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MovieTicket ticket = new BasicTicket();
        double additionalCost = 0.00; // Variable to track the added cost

        System.out.println("Basic Movie Ticket created.");

        // Process user choices
        TicketAndCost result = processChoices(ticket, additionalCost);

        // Display final ticket description and cost
        System.out.println("\nYour ticket: " + result.getTicket().getDescription());
        System.out.println("Base cost: $" + result.getTicket().cost());
        System.out.println("Additional cost: $" + result.getAdditionalCost());
        System.out.println("Total cost: $" + (result.getTicket().cost() + result.getAdditionalCost()));

        scanner.close();
    }

    private static TicketAndCost processChoices(MovieTicket ticket, double additionalCost) {
        System.out.println("Choose extras for your movie ticket:");
        System.out.println("1. Popcorn");
        System.out.println("2. Drinks");
        System.out.println("3. 3D Glasses");
        System.out.println("4. Done");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Process the chosen option
        switch (choice) {
            case 1:
                ticket = new PopcornDecorator(ticket);
                additionalCost += 5.00; // Track the cost of popcorn
                System.out.println("Popcorn added.");
                break;
            case 2:
                ticket = new DrinksDecorator(ticket);
                additionalCost += 3.00; // Track the cost of drinks
                System.out.println("Drinks added.");
                break;
            case 3:
                ticket = new GlassesDecorator(ticket);
                additionalCost += 4.00; // Track the cost of 3D glasses
                System.out.println("3D Glasses added.");
                break;
            case 4:
                return new TicketAndCost(ticket, additionalCost); // Exit recursion
            default:
                System.out.println("Invalid choice.");
                break;
        }

        // Recursively process further choices
        return processChoices(ticket, additionalCost);
    }

    // Helper class to return ticket and additional cost
    private static class TicketAndCost {
        private final MovieTicket ticket;
        private final double additionalCost;

        public TicketAndCost(MovieTicket ticket, double additionalCost) {
            this.ticket = ticket;
            this.additionalCost = additionalCost;
        }

        public MovieTicket getTicket() {
            return ticket;
        }

        public double getAdditionalCost() {
            return additionalCost;
        }
    }
}
