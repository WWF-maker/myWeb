package com.example.demo.model.refund;

import lombok.Data;

@Data
public class RefundPo {
    String id;
    String refundId;
    String paymentId;
    String startTime;
    String expireTime;
    String state;
}
