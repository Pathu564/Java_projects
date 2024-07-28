package Structural.flyweight;

// Concrete Flyweight
public class ConcreteCharacterFormat implements CharacterFormat {
    private String fontType;
    private int fontSize;
    private String color;
    private boolean bold;
    private boolean italic;
    private boolean underline;

    public ConcreteCharacterFormat(String fontType, int fontSize, String color, boolean bold, boolean italic, boolean underline) {
        this.fontType = fontType;
        this.fontSize = fontSize;
        this.color = color;
        this.bold = bold;
        this.italic = italic;
        this.underline = underline;
    }

    @Override
    public void applyFormat(char character) {
        // Display character with formatting
        System.out.printf("Character: %c, Font: %s, Size: %d, Color: %s, Bold: %b, Italic: %b, Underline: %b\n",
                character, fontType, fontSize, color, bold, italic, underline);
    }
}
