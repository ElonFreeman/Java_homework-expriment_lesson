public class execise31 {

    static class Book {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    static class MathBook extends Book {
        private String type;

        public MathBook(String title, String author, double price, String type) {
            super(title, author, price);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static void main(String[] args) {
        MathBook linearAlgebra = new MathBook("Linear Algebra", "Jiang Guangfeng", 33.70, "University Mathematics");

        System.out.println("Book Title: " + linearAlgebra.getTitle());
        System.out.println("Book Category: " + linearAlgebra.getType());
        System.out.println("Book Author: " + linearAlgebra.getAuthor());
        System.out.printf("Book Price: %.2f\n", linearAlgebra.getPrice());
    }
}