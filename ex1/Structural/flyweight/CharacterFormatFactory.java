package Structural.flyweight;


import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class CharacterFormatFactory {
    private static final Map<String, CharacterFormat> formats = new HashMap<>();

    public static CharacterFormat getCharacterFormat(String fontType, int fontSize, String color, boolean bold, boolean italic, boolean underline) {
        String key = fontType + ":" + fontSize + ":" + color + ":" + bold + ":" + italic + ":" + underline;
        if (!formats.containsKey(key)) {
            System.out.println("Creating new character format with key: " + key);
            formats.put(key, new ConcreteCharacterFormat(fontType, fontSize, color, bold, italic, underline));
        }
        return formats.get(key);
    }
}

