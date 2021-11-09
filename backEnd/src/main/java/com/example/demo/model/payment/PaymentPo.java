package com.example.demo.model.payment;

import lombok.Data;

@Data
public class PaymentPo {
    static String appId="ooad-course-design";
    static String mchId="1-04";
    String id;
    String paymentId;
    String orderId;
    double dueAmount;
    double paidAmount;
    String startTime;
    String expireTime;
    String state;
    String type;
}
