package com.example.demo.model.refund;

import lombok.Data;

@Data
public class RefundVo {
    String id;
    String refundId;
    String paymentId;
    String startTime;
    String expireTime;
    String state;
}
