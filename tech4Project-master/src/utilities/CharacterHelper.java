package utilities;

public class CharacterHelper {

    // is it a space (boolean)
    public static boolean isSpace(char character){
        return character == 32;
    }

    // is it a digit (boolean)
    public static boolean isDigit(char character){
        return character >= 48 && character <= 57;
    }

    // is it uppercase (boolean)
    public static boolean isUppercase(char character){
        return character >= 65 && character <= 90;
    }

    // is it lowercase (boolean)
    public static boolean isLowercase(char character){
        return character >= 97 && character <= 122;
    }

    // is it a letter (boolean)
    public static boolean isLetter(char character){
        return isUppercase(character) || isLowercase(character);
    }

    // is it a vowel (boolean)
    public static boolean isVowel(char character){
        return (character == 'A') || (character == 'E') || (character == 'O') || (character == 'U') ||
                (character == 'I') || (character == 'a') || (character == 'e') || (character == 'o') ||
                (character == 'u') || (character == 'i');
    }

    // is it a consonant (boolean)
    public static boolean isConsonant(char character){
        return !isVowel(character);
    }
}
