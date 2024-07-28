package strategypattern;

// Concrete strategy for train obstacle
public class TrainStrategy implements ObstacleStrategy {
    @Override
    public void handleObstacle() {
        System.out.println("You jumped over the train!");
    }
}
