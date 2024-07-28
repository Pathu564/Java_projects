// Main class
package observerpattern;
public class YouTubeSubscriptionSystem {
    public static void main(String[] args) {
        MyYouTubeChannel channel = new MyYouTubeChannel();
        ChannelOwnerMenu menu = new ChannelOwnerMenu(channel);

        // Start the interaction with menu handling
        menu.start();
    }
}
