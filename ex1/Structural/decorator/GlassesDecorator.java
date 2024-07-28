package Structural.decorator;

// Concrete Decorator for 3D Glasses
public class GlassesDecorator extends TicketDecorator {
    private static final double GLASSES_COST = 4.00;

    public GlassesDecorator(MovieTicket decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + ", 3D Glasses";
    }

    @Override
    public double cost() {
        return decoratedTicket.cost() + GLASSES_COST;
    }
}
