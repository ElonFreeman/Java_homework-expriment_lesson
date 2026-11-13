public class one {

    class book {

        String title,author;
        float price;

        book(String title,String author,float price)
        {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void show()
        {
            System.out.println(title + ' ' + author + ' ' + price);
        }
    }

    public void main(String args[])
    {
        book b1 = new book("JAVA Programming","gengxiangyi",65.0f);
        b1.show();
        book b2 = new book("JAVA Programming Basics","chenguojun",99.0f);
        b2.show();
    }
}
