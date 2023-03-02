import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new OrderPageComparator());

        books.add(new Book("Rüzgarın Getirdiği", 102, "Debbie Macomber", "2022"));
        books.add(new Book("Kadının Işığı", 150, "Yu Hua", "2022"));
        books.add(new Book("Yaşamak", 80, "Debbie Macomber", "2016"));
        books.add(new Book("Kahve Soğumadan Önce", 205, "Toshikazu Kawaguchi", "2021"));
        books.add(new Book("Hayvan Çiftliği", 96, "George Orwell", "1945"));

        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next().getName());
        }
    }
}