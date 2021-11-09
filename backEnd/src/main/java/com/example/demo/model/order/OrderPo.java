package com.example.demo.model.order;


import lombok.Data;

@Data
public class OrderPo {
    int id;
    int customerId;
    int shopId;
    int pid;
    String consignee;
    int regionId;
    String address;
    String mobile;
    String message;
    int type;
    double freightPrice;
    int couponId;
    double discountPrice;
    double originPrice;
    int presaleId;
    int grouponId;
    String confirmTime;
    int shipmentId;
    String state;
    String subState;
    boolean beDeleted;
    int point;
}
