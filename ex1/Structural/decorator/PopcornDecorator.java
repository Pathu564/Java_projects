package Structural.decorator;

// Concrete Decorator for Popcorn
public class PopcornDecorator extends TicketDecorator {
    private static final double POPCORN_COST = 5.00;

    public PopcornDecorator(MovieTicket decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + ", Popcorn";
    }

    @Override
    public double cost() {
        return decoratedTicket.cost() + POPCORN_COST;
    }
}
