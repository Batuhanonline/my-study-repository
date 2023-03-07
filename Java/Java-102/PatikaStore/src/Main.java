import BrandManager.Brand;
import BrandManager.OrderBrandComparator;
import CategoryManager.Category;
import CategoryManager.NotebookCategory;
import CategoryManager.PhoneCategory;
import ProductManager.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void notebook(ArrayList<ProductManager> products) {
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        for(ProductManager product : products) {
            if (product.getCategory().getName().equals("Notebook")) {
                System.out.println("| "+ product.getId() +" | "+ product.getName() +"                     " +
                        "| "+ product.getPrice() +"     | "+ product.getBrand().getName() +"     " +
                        "| "+ product.getCategory().getStorage() +"  | "+ product.getCategory().getScreenSize() +"     " +
                        "| "+ product.getCategory().getRAM() +"         |");
            }
        }
    }

    public static void phone(ArrayList<ProductManager> products) {
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Batarya  | Ekran     | RAM         |");
        for(ProductManager product : products) {
            if (product.getCategory().getName().equals("Phone")) {
                System.out.println("| "+ product.getId() +" | "+ product.getName() +"                     " +
                        "| "+ product.getPrice() +"     | "+ product.getBrand().getName() +"     " +
                        "| "+ product.getCategory().getBatery() +"  | "+ product.getCategory().getScreenSize() +"     " +
                        "| "+ product.getCategory().getRAM() +"         |");
            }
        }
    }

    public static void brandList(ArrayList<Brand> brands) {
        brands.sort(new OrderBrandComparator());
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    public static void main(String[] args) {
        boolean isClose = false;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Brand> brands = new ArrayList<>();
        ArrayList<ProductManager> products = new ArrayList<>();

        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));



        products.add(new Product(1,"HUAWEI Matebook 14", "7000.0", 0, 18, brands.get(4), new NotebookCategory("14.0", "512", "16", "Gri")));
        products.add(new Product(2, "LENOVO V14 IGL", "3699.0", 0, 20, brands.get(2), new NotebookCategory("14.0", "1024", "8", "Siyah")));
        products.add(new Product(3, "ASUS Tuf Gaming", "8199.0", 0, 20, brands.get(6), new NotebookCategory("15.6", "2048", "32", "Siyah")));

        products.add(new Product(4, "SAMSUNG GALAXY A51", "3199.0", 0, 20, brands.get(1), new PhoneCategory("6.5", "4000", "6", "Siyah")));
        products.add(new Product(5, "IPhone 11", "7379.0", 0, 20, brands.get(6), new PhoneCategory("6.1", "3046", "6", "Mavi")));
        products.add(new Product(6, "Redmi Note 10 Pro", "4012.0", 0, 20, brands.get(6), new PhoneCategory("6.5", "4000", "12", "Beyaz")));


        while (!isClose) {
            System.out.print("PatikaStore Ürün Yönetim Paneli !\n" +
                    "1 - Notebook İşlemleri\n" +
                    "2 - Cep Telefonu İşlemleri\n" +
                    "3 - Marka Listele\n" +
                    "0 - Çıkış Yap\n" +
                    "Tercihiniz : ");
            int selected = scanner.nextInt();

            switch (selected){
                case 0 -> isClose = true;
                case 1 -> notebook(products);
                case 2 -> phone(products);
                case 3 -> brandList(brands);
                default -> System.out.println("Yanlış seçim yaptınız!!!");
            }
        }

    }
}