package Creational.prototypepattern;

// Concrete prototype for a Letter
public class Letter implements DocumentPrototype {
    private String content;

    public Letter(String content) {
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() {
        return new Letter(this.content);
    }

    @Override
    public void showContent() {
        System.out.println("Letter Content: " + content);
    }
}
