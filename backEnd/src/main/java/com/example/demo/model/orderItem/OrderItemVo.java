package com.example.demo.model.orderItem;

import lombok.Data;

@Data
public class OrderItemVo {
    int skuId;
    double quantity;
    int couponActId;
}
