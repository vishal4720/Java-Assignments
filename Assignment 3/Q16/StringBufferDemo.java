public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Delete
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);
    }
}
