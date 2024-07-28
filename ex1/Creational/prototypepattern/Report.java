package Creational.prototypepattern;

// Concrete prototype for a Report
public class Report implements DocumentPrototype {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() {
        return new Report(this.content);
    }

    @Override
    public void showContent() {
        System.out.println("Report Content: " + content);
    }
}
