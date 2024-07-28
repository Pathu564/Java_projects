// Concrete Observer
package observerpattern;
public class UserSubscriber implements Subscriber {
    private String name;

    public UserSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " has been notified of a new video: " + videoTitle);
    }

    @Override
    public String getName() {
        return name;
    }
}
