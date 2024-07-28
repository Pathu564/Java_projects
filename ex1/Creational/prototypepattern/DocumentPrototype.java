package Creational.prototypepattern;

// Prototype interface
public interface DocumentPrototype extends Cloneable {
    DocumentPrototype clone();
    void showContent();
}
