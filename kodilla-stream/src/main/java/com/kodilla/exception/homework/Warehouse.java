package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private boolean orderNumber;

    private Map<String, Boolean> getNumberOfOrder() {
        Map<String, Boolean> orders = new HashMap<>();
        orders.put("1/2023", true);
        orders.put("2/2023", true);
        orders.put("3/2023", false);
        return orders;
    }
}
