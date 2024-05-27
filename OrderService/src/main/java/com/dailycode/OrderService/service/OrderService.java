package com.dailycode.OrderService.service;

import com.dailycode.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
