package com.example.demo.model.order;

import com.example.demo.model.orderItem.OrderItemVo;
import lombok.Data;

import java.util.List;

@Data
public class OrderVo {
    String consignee;
    int regionId;
    String address;
    String mobile;
    String message;
    int couponId;
    int presaleId;
    int grouponId;
    List<OrderItemVo> orderItemVoList;
}
