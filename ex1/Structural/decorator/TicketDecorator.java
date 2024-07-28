package Structural.decorator;

// Decorator Class
public abstract class TicketDecorator implements MovieTicket {
    protected MovieTicket decoratedTicket;

    public TicketDecorator(MovieTicket decoratedTicket) {
        this.decoratedTicket = decoratedTicket;
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription();
    }

    @Override
    public double cost() {
        return decoratedTicket.cost();
    }
}
