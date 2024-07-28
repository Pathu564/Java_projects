package observerpattern;
import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class MyYouTubeChannel implements YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideoTitle;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " has been subscribed.");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " has been unsubscribed.");
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestVideoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideoTitle = videoTitle;
        System.out.println("New video uploaded: " + videoTitle);
        notifySubscribers();
    }

    // Add this method to provide access to the subscriber list
    public List<Subscriber> getSubscribers() {
        return subscribers;
    }
}
