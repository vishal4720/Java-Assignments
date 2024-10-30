public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]);

            String str = null;
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred.");
        }
    }
}
