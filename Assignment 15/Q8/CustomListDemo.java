import java.util.Arrays;

class CustomList {
    private Object[] elements = new Object[10];
    private int size = 0;

    public void add(Object element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    public Object get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        return elements[index];
    }

    public void remove(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public int size() {
        return size;
    }
}

public class CustomListDemo {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        list.add("apple");
        list.add("banana");
        System.out.println("List size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
    }
}
