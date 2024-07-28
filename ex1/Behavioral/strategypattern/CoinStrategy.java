package strategypattern;

// Concrete strategy for coin obstacle
public class CoinStrategy implements ObstacleStrategy {
    @Override
    public void handleObstacle() {
        System.out.println("You collected a coin!");
    }
}
