package com.jumble;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String jumbledString(String string, long number) {
        final List<Character> arrayOfString = getCharacterList(string.toCharArray());

        String evenString = "";
        String oddString = "";
        String tempOddString = null;

        for (Character text : arrayOfString) {
            if ((arrayOfString.indexOf(text) % 2) == 0) {
                evenString = evenString + text; // even characters
            } else {
                oddString = oddString + text; // odd characters
            }
        }
        for (int x = 0; x < number; x++) {
            tempOddString = tempOddString == null ? oddString : tempOddString;
            oddString += tempOddString;
        }
        return evenString + oddString;
    }

    public static List<Character> getCharacterList(char[] chars) {
        List<Character> characters = new ArrayList<>();
        for (char character : chars) {
            characters.add(character);
        }
        return characters;
    }

    public static void main(String[] args) {
        System.out.println(jumbledString("Wow Example!", 1000000));
    }
}
