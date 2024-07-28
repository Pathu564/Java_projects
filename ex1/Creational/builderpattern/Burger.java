package Creational.builderpattern;

// Burger class with a nested Builder class
public class Burger {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    // Private constructor to enforce object creation through the builder
    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    // Display the burger's ingredients
    public void display() {
        System.out.println("Burger Size: " + size);
        System.out.println("Cheese: " + (cheese ? "Yes" : "No"));
        System.out.println("Pepperoni: " + (pepperoni ? "Yes" : "No"));
        System.out.println("Lettuce: " + (lettuce ? "Yes" : "No"));
        System.out.println("Tomato: " + (tomato ? "Yes" : "No"));
    }

    // Static nested class for the builder
    public static class BurgerBuilder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean lettuce;
        private boolean tomato;

        // Method to set the size
        public BurgerBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        // Method to add cheese
        public BurgerBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        // Method to add pepperoni
        public BurgerBuilder addPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        // Method to add lettuce
        public BurgerBuilder addLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        // Method to add tomato
        public BurgerBuilder addTomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        // Build method to construct the final burger
        public Burger build() {
            return new Burger(this);
        }
    }
}
