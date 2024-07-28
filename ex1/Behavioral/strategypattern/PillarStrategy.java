package strategypattern;

// Concrete strategy for pillar obstacle
public class PillarStrategy implements ObstacleStrategy {
    @Override
    public void handleObstacle() {
        System.out.println("You crashed into the pillar!");
    }
}
