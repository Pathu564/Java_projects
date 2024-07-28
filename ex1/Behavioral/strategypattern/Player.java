package strategypattern;

import java.util.Scanner;

// Context class
public class Player {
    private ObstacleStrategy strategy;

    public void setStrategy(ObstacleStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleObstacle() {
        if (strategy != null) {
            strategy.handleObstacle();
        } else {
            System.out.println("No obstacle to handle!");
        }
    }

    public void playGame(Scanner scanner) {
        System.out.print("Enter obstacle (train, pillar, coin, platform, sign, or quit): ");
        String obstacle = scanner.nextLine().toLowerCase();  // Convert input to lowercase for consistency

        if (obstacle.equals("quit")) {
            System.out.println("Exiting the game. Goodbye!");
            scanner.close();
            return;
        }

        // Determine which strategy to use based on the obstacle
        switch (obstacle) {
            case "train":
                setStrategy(new TrainStrategy());
                break;
            case "pillar":
                setStrategy(new PillarStrategy());
                break;
            case "coin":
                setStrategy(new CoinStrategy());
                break;
            case "platform":
                setStrategy(new PlatformStrategy());
                break;
            case "sign":
                setStrategy(new SignStrategy());
                break;
            default:
                System.out.println("Invalid obstacle! Please try again.");
                playGame(scanner);  // Retry for invalid input
                return;
        }

        handleObstacle();
        playGame(scanner);
    }
}
