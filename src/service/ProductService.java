package service;

import model.Product;
import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductService() {

        //! Examples of products
        products.add(new Product(
            "PCB Prototype",
            "images/pcb1.png",
            12.99,
            "2-layer PCB board"));

        products.add(new Product(
            "Solder Kit",
            "images/solder.png",
            8.50,
            "Complete soldering kit"));
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
