package Task2;

public class Customer5 {
    public static void convertSentence(String sentence) {
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());
    }

    public static void main(String[] args) {
        String sentence = "Hello, World!";
        convertSentence(sentence);
    }
}
