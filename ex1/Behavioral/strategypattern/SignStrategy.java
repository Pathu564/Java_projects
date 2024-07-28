package strategypattern;

// Concrete strategy for sign obstacle
public class SignStrategy implements ObstacleStrategy {
    @Override
    public void handleObstacle() {
        System.out.println("You crashed into the sign!");
    }
}
