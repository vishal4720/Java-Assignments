class Product {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(101);
        product.setName("Laptop");
        product.setPrice(800.50);

        System.out
                .println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
    }
}
