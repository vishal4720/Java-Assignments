package ecommerce;

public class Order {
    private Product product;
    private Customer customer;

    public Order(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }
}
