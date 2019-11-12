package com.jumble;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String jumbledString(String string, long number) {
        final List<Character> arrayOfString = getCharacterList(string.toCharArray());

        final StringBuilder evenString = new StringBuilder();
        final StringBuilder oddString = new StringBuilder();

        for (Character text : arrayOfString) {
            moveToLeftOrRight(arrayOfString, evenString, oddString, text);
        }
        for (int x = 0; x < number; x++) {
            oddString.append(oddString);
        }

        final StringBuilder stringToPrint = evenString.append(oddString);
        return String.valueOf(stringToPrint);
    }

    private static void moveToLeftOrRight(List<Character> arrayOfString, StringBuilder evenString, StringBuilder oddString, Character text) {
        if ((arrayOfString.indexOf(text) % 2) == 0) {
            evenString.append(text); // even characters
        } else {
            oddString.append(text); // odd characters
        }
    }

    public static List<Character> getCharacterList(char[] chars) {
        List<Character> characters = new ArrayList<>();
        for (char character : chars) {
            characters.add(character);
        }
        return characters;
    }

    public static void main(String[] args) {
        System.out.println(jumbledString("Wow Example!", 1));
    }
}
