import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));

        List<Product> expensiveProducts = products.stream()
                .filter(p -> p.price > 700)
                .collect(Collectors.toList());
        System.out.println("Expensive products: " + expensiveProducts);
    }
}
