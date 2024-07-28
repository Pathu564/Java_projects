package strategypattern;

// Concrete strategy for platform obstacle
public class PlatformStrategy implements ObstacleStrategy {
    @Override
    public void handleObstacle() {
        System.out.println("You landed on the platform!");
    }
}
