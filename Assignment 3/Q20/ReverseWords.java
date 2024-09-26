public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuffer sb = new StringBuffer(word);
            result.append(sb.reverse().toString()).append(" ");
        }

        System.out.println("Reversed words: " + result.toString().trim());
    }
}
