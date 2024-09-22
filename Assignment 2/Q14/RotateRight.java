import java.util.Scanner;

public class RotateRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number of positions to rotate right: ");
        int k = scanner.nextInt();
        
        k = k % n; // In case k is greater than array length
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i - k + n) % n];
        }
        
        System.out.println("Array after right rotation:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
