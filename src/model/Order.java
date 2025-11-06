package model;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;
    private double totalPrice;
    private User user;
    private Model model;

    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void addModel (Model model) {
        this.model = model;
        totalPrice +=model.getModelTotal();
    }

    public User getUser() {
        return user;
    }
}
