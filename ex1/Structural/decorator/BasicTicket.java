package Structural.decorator;

// Concrete Component
public class BasicTicket implements MovieTicket {
    @Override
    public String getDescription() {
        return "Basic Movie Ticket";
    }

    @Override
    public double cost() {
        return 10.00; // Base price
    }
}
