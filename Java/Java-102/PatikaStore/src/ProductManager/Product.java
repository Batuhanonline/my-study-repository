package ProductManager;

import BrandManager.Brand;
import CategoryManager.Category;

public class Product extends ProductManager{

    public Product(int id, String name, String price, int discountRate, int stock, Brand brand, Category category) {
        super(id, name, price, discountRate, stock, brand, category);
    }


}
