package strategypattern;

import java.util.Scanner;

public class SubwaySurfersGame {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        player.playGame(scanner);
    }
}
