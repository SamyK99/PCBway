package service;

import model.Product;
import model.User;
import model.Order;

public class OrderService {
    private Order currentOrder;

    public void startNewOrder(User user) {
        currentOrder = new Order(user);
    }

    public void addToCart(Product product) {
        if (currentOrder != null) {
            currentOrder.addProduct(product);
        }
    }

    public double getTotal() {
        if (currentOrder == null) return 0;
        return currentOrder.getTotalPrice();
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }
}
