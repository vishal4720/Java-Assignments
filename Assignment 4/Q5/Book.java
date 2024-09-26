class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(Book book) {
        this.title = book.title;
        this.author = book.author;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Vishal Patole");
        Book book2 = new Book(book1);
        book2.displayDetails();
    }
}
