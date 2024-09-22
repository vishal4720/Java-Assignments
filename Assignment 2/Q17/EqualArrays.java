import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the arrays: ");
        int n = scanner.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
