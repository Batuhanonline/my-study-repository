import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /*Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
        Book sınıfından 10 tane nesne üretip bunu bir ArrayList yapısında saklayınız. stream yapısını ve
        lambda ifadelerini kullanarak kitap isminin karşısında yazar ismi olacak şekilde yeni bir Map<String, String>
        oluşturacak şekilde yazınız.

         */

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Sutherland", 219, "Julita Matchell", "9/3/1993"));
        books.add(new Book("Crowley", 57, "Benny Gadman", "8/26/2009"));
        books.add(new Book("Division", 	92, "Darius Siviter", "9/3/1993"));
        books.add(new Book("Bowman", 	230, "Daniel Schlag", "9/3/1993"));
        books.add(new Book("Westport", 53, "Conan Grimsdith", "9/3/1993"));
        books.add(new Book("Manley", 182, "Julita Matchell", "9/3/1993"));
        books.add(new Book("Straubel", 21, "Julita Matchell", "9/3/1993"));
        books.add(new Book("Park Meadow", 400, "Julita Matchell", "9/3/1993"));
        books.add(new Book("Loftsgordon", 87, "Julita Matchell", "9/3/1993"));
        books.add(new Book("International", 214, "Julita Matchell", "9/3/1993"));


        Map<String, String> booksMap = new TreeMap<>();
        books.stream().forEach(book -> booksMap.put(book.getBookName(), book.getAuthorName()));

        /*
        Bu 10 elemanlık Book listesinden sayfa sayısı 100'den fazla olan kitapları filtreleyen ve yeni bir liste olarak verecek geliştirmeyi yapınız.
        (Stream ve Lambda ifadeleri kullanabilirsiniz.)
         */

        ArrayList<Book> books100 = new ArrayList<>();

        books.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> books100.add(book));
        books100.stream().forEach(book -> System.out.println(book.getBookName()));

    }
}