package Structural.decorator;

// Concrete Decorator for Drinks
public class DrinksDecorator extends TicketDecorator {
    private static final double DRINKS_COST = 3.00;

    public DrinksDecorator(MovieTicket decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + ", Drinks";
    }

    @Override
    public double cost() {
        return decoratedTicket.cost() + DRINKS_COST;
    }
}
