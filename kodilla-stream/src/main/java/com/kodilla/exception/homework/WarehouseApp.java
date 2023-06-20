package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1/2023"));
        orders.add(new Order("2/2023"));
        System.out.println(orders.size());
        for (Order order : orders)
            System.out.println(order);
    }
}
