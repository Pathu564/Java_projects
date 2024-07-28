package observerpattern;
import java.util.Scanner;

// Menu for Channel Owner
public class ChannelOwnerMenu {
    private Scanner scanner = new Scanner(System.in);
    private MyYouTubeChannel channel;

    public ChannelOwnerMenu(MyYouTubeChannel channel) {
        this.channel = channel;
    }

    public void start() {
        showMenu();
    }

    private void showMenu() {
        System.out.println("\nYouTube Channel Owner Menu:");
        System.out.println("1. Subscribe a user");
        System.out.println("2. Unsubscribe a user");
        System.out.println("3. Upload a new video");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                handleSubscribe();
                break;
            case 2:
                handleUnsubscribe();
                break;
            case 3:
                handleUploadVideo();
                break;
            case 0:
                System.out.println("Exiting the system. Goodbye!");
                System.exit(0); // Exit the program
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        // Recursively call to continue interaction
        showMenu();
    }

    private void handleSubscribe() {
        System.out.print("Enter subscriber's name: ");
        String name = scanner.nextLine();
        Subscriber subscriber = new UserSubscriber(name);
        channel.subscribe(subscriber);
    }

    private void handleUnsubscribe() {
        System.out.print("Enter subscriber's name to unsubscribe: ");
        String name = scanner.nextLine();
        // Finding the subscriber from the list to remove
        Subscriber toRemove = null;
        for (Subscriber sub : channel.getSubscribers()) {
            if (sub.getName().equals(name)) {
                toRemove = sub;
                break;
            }
        }

        if (toRemove != null) {
            channel.unsubscribe(toRemove);
        } else {
            System.out.println("Subscriber not found.");
        }
    }

    private void handleUploadVideo() {
        System.out.print("Enter video title: ");
        String title = scanner.nextLine();
        channel.uploadVideo(title);
    }
}
