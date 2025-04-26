import java.util.*;

public class BadWords {
    public static String censorSentence(String sentence, List<String> badWords) {
        for (String badWord : badWords) {
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return sentence;
    }

    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");

        String censored = censorSentence(input, badWords);
        System.out.println("Censored: " + censored);
    }
}