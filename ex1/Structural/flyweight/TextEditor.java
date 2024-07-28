package Structural.flyweight;


import java.util.ArrayList;
import java.util.List;

// Client
public class TextEditor {
    private List<TextCharacter> textCharacters = new ArrayList<>();

    public void addCharacter(char character, String fontType, int fontSize, String color, boolean bold, boolean italic, boolean underline) {
        CharacterFormat format = CharacterFormatFactory.getCharacterFormat(fontType, fontSize, color, bold, italic, underline);
        textCharacters.add(new TextCharacter(character, format));
    }

    public void displayDocument() {
        for (TextCharacter textCharacter : textCharacters) {
            textCharacter.display();
        }
    }

    // Inner class to represent a character in the document
    private static class TextCharacter {
        private char character;
        private CharacterFormat format;

        public TextCharacter(char character, CharacterFormat format) {
            this.character = character;
            this.format = format;
        }

        public void display() {
            format.applyFormat(character);
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addCharacter('H', "Arial", 12, "Black", true, false, false);
        editor.addCharacter('e', "Arial", 12, "Black", true, false, false);
        editor.addCharacter('l', "Arial", 12, "Black", true, false, false);
        editor.addCharacter('l', "Arial", 12, "Black", true, false, false);
        editor.addCharacter('o', "Arial", 12, "Black", true, false, false);

        editor.addCharacter(' ', "Arial", 12, "Black", false, false, false);

        editor.addCharacter('W', "Arial", 14, "Red", false, true, false);
        editor.addCharacter('o', "Arial", 14, "Red", false, true, false);
        editor.addCharacter('r', "Arial", 14, "Red", false, true, false);
        editor.addCharacter('l', "Arial", 14, "Red", false, true, false);
        editor.addCharacter('d', "Arial", 14, "Red", false, true, false);

        editor.displayDocument();
    }
}
