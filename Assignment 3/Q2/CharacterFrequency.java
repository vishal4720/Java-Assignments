import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
        }
        
        System.out.println("Character frequencies:");
        for (Character key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key));
        }

        scanner.close();
    }
}
