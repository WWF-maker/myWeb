package com.example.demo.model.orderItem;

import lombok.Data;

@Data
public class OrderItemPo {
    String id;
    String ordersId;
    String skuId;
    double quantity;
    double perPrice;
    double discount;
    String name;
    int couponActId;
}
