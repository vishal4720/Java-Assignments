public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string with multiple words";
        String[] words = str.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
