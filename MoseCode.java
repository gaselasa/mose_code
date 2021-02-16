/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosecode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gasela
 */
public class MoseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String s = "hi there";

        System.out.println(letterToMorseCode(s));

        System.out.print(morseCodeToLetters(".... .. /  - .... . .-. ."));
    }

    private static String letterToMorseCode(String word) {
        int count = 0;

        StringBuilder code = new StringBuilder();

        while (count < word.length()) {

            char letter = word.toLowerCase().charAt(count);

            switch (letter) {
                case 'a':
                    code.append(".-");
                    code.append(" ");
                    break;

                case 'b':
                    code.append("-...");
                    code.append(" ");
                    break;

                case 'c':
                    code.append(" -.-.");
                    code.append(" ");
                    break;

                case 'd':
                    code.append("-..");
                    code.append(" ");
                    break;

                case 'e':
                    code.append(".");
                    code.append(" ");
                    break;

                case 'f':
                    code.append("..-.");
                    code.append(" ");
                    break;
                case 'g':
                    code.append("--.");
                    code.append(" ");
                    break;
                case 'h':
                    code.append("....");
                    code.append(" ");
                    break;

                case 'i':
                    code.append("..");
                    code.append(" ");
                    break;
                case 'j':
                    code.append(".---");
                    code.append(" ");
                    break;
                case 'k':
                    code.append("-.-");
                    code.append(" ");
                    break;
                case 'l':
                    code.append(".-..");
                    code.append(" ");
                    break;
                case 'm':
                    code.append("--");
                    code.append(" ");
                    break;
                case 'n':
                    code.append("-.");
                    code.append(" ");
                    break;
                case 'o':
                    code.append("---");
                    code.append(" ");
                    break;
                case 'p':
                    code.append(".--.");
                    code.append(" ");
                    break;
                case 'q':
                    code.append("--.-");
                    code.append(" ");
                    break;
                case 'r':
                    code.append(".-.");
                    code.append(" ");
                    break;
                case 's':
                    code.append("...");
                    code.append(" ");
                    break;
                case 't':
                    code.append("-");
                    code.append(" ");
                    break;
                case 'u':
                    code.append("..-");
                    code.append(" ");
                    break;
                case 'v':
                    code.append("...-");
                    code.append(" ");
                    break;
                case 'w':
                    code.append(".--");
                    code.append(" ");
                    break;
                case 'x':
                    code.append("-..-");
                    code.append(" ");
                    break;
                case 'y':
                    code.append("-.--");
                    code.append(" ");
                    break;
                // for space
                case 'z':
                    code.append("--..");
                    code.append(" ");
                    break;

                case '1':
                    code.append(".----");
                    code.append(" ");
                    break;
                case '2':
                    code.append("..---");
                    code.append(" ");
                    break;
                case '3':
                    code.append("...--");
                    code.append(" ");
                    break;
                case '4':
                    code.append("....-");
                    code.append(" ");
                    break;
                case '5':
                    code.append(".....");
                    code.append(" ");
                    break;
                case '6':
                    code.append("-....");
                    code.append(" ");
                    break;
                case '7':
                    code.append("--...");
                    code.append(" ");
                    break;
                case '8':
                    code.append("---..");
                    code.append(" ");
                    break;
                case '9':
                    code.append("----.");
                    code.append(" ");
                    break;
                case '0':
                    code.append("-----");
                    code.append(" ");
                    break;
                default:
                    code.append("/");
                    code.append(" ");
            }

            count++;
        }

        String encodedText = code.toString().trim();

        int inputSize = word.length();

        int outputSize = encodedText.split(" ").length;
        String[] h = encodedText.split(" ");
   

        assert (word.charAt(2) == ' ') && encodedText.split(" ")[2].equals("/") : "output dont have same number of space";
        assert inputSize == outputSize : "input string size is not same as output";

        return encodedText;

    }

    public static String morseCodeToLetters(String encodedWord) {

        final Map<String, Character> morseAlphabet = new HashMap<>();

        morseAlphabet.put(".-", 'A');
        morseAlphabet.put("-...", 'B');
        morseAlphabet.put("-.-.", 'C');
        morseAlphabet.put("-..", 'D');
        morseAlphabet.put(".", 'E');
        morseAlphabet.put("..-.", 'F');
        morseAlphabet.put("--.", 'G');
        morseAlphabet.put("....", 'H');
        morseAlphabet.put("..", 'I');
        morseAlphabet.put(".---", 'J');
        morseAlphabet.put("-.-", 'K');
        morseAlphabet.put(".-..", 'L');
        morseAlphabet.put("--", 'M');
        morseAlphabet.put("-.", 'N');
        morseAlphabet.put("---", 'O');
        morseAlphabet.put(".--.", 'P');
        morseAlphabet.put("--.-", 'Q');
        morseAlphabet.put(".-.", 'R');
        morseAlphabet.put("...", 'S');
        morseAlphabet.put("-", 'T');
        morseAlphabet.put("..-", 'U');
        morseAlphabet.put("...-", 'V');
        morseAlphabet.put(".--", 'W');
        morseAlphabet.put("-..-", 'X');
        morseAlphabet.put("-.--", 'Y');
        morseAlphabet.put("--..", 'Z');
        morseAlphabet.put("-----", '0');
        morseAlphabet.put(".----", '1');
        morseAlphabet.put("..---", '2');
        morseAlphabet.put("...--", '3');
        morseAlphabet.put("....-", '4');
        morseAlphabet.put(".....", '5');
        morseAlphabet.put("-....", '6');
        morseAlphabet.put("--...", '7');
        morseAlphabet.put("---..", '8');
        morseAlphabet.put("----.", '9');
        morseAlphabet.put("/", ' ');

        int trackLetter = 1;

      

        String decodedText = "";
        for (String word : encodedWord.trim().split("   ")) {
            for (String letter : word.split("\\s+")) {
                decodedText += morseAlphabet.get(letter);
                trackLetter++;
            }
            decodedText += ' ';
        }

        assert trackLetter == decodedText.length() : "input string size is not same as output";

        return decodedText;

    }

}
