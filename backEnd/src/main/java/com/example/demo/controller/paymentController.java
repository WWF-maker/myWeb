package com.example.demo.controller;

import com.example.demo.model.payment.PaymentVo;
import com.example.demo.model.refund.RefundVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@Api(value="支付模块API",tags="支付模块API")
@CrossOrigin
public class paymentController {
    @GetMapping("/states")
    @ApiOperation(value="获取所有支付单的支付状态")
    public String getPaymentsState(){
        return "Get it";
    }
    @GetMapping("/patterns")
    @ApiOperation(value="获取所有的支付渠道")
    public String getPaymentsPatterns(){
        return "Get it";
    }
    @PostMapping("/orders/{id}/payments")
    @ApiOperation(value="面向买家：买家为订单创建支付单")
    public String createPayment(@RequestHeader(name="authorization")String auth,
                                @PathVariable(name="id")String id,
                                @RequestBody PaymentVo payment) {
        return "Get it";
    }
    @GetMapping("/orders/{id}/payments")
    @ApiOperation(value="面向买家：买家根据订单id获取支付信息")
    public String createPayment(@RequestHeader(name="authorization")String auth,
                                @PathVariable(name="id")String id) {
        return "Get it";
    }
    @GetMapping("/shop/{shopId}/orders/{id}/payments")
    @ApiOperation(value="面向商铺：商铺根据商铺id和订单id查询自己名下订单的支付信息")
    public String getShopCertainOrderPayment(@RequestHeader(name="authorization")String auth,
                                             @PathVariable(name="shopId")String shopId,
                                             @PathVariable(name="id")String id){
        return "Get it";
    }
    @PostMapping("/aftersales/{id}/payments")
    @ApiOperation(value="面向买家：买家为售后订单创建支付单")
    public String getAftersalesPayments(@RequestHeader(name="authorization")String auth,
                                        @PathVariable(name="id")String id,
                                        @RequestBody PaymentVo payment){
        return "Get it";
    }
    @GetMapping("/aftersales/{id}/payments")
    @ApiOperation(value="面向买家：买家根据售后订单id查询支付单")
    public String getAftersalesPayments(@RequestHeader(name="authorization")String auth,
                                        @PathVariable(name="id")String id){
        return "Get it";
    }
    @GetMapping("/shops/{shopId}/aftersales/{id}/payments")
    @ApiOperation(value="面向商铺：商铺根据商铺id和售后订单id查询名下的售后订单支付信息")
    public String getShopAfterSalePayments(@RequestHeader(name="authorization")String auth,
                                           @PathVariable(name="shopId")String shopId,
                                           @PathVariable(name="id")String id){
        return "Get it";
    }
    @PostMapping("/shops/{shopId}/payments/{id}/refunds")
    @ApiOperation(value="面向商铺：商铺根据商铺id和支付id，对自己名下的已支付支付单发起退款")
    public String submitRefund(@RequestHeader(name="authorization")String auth,
                                           @PathVariable(name="shopId")String shopId,
                                           @PathVariable(name="id")String id,
                                           @RequestBody RefundVo refund){
        return "Get it";
    }
    @GetMapping("/shops/{shopId}/orders/{id}/refunds")
    @ApiOperation(value="面向商铺：商铺根据商铺id和订单id查询名下退款信息")
    public String getOrderRefund(@RequestHeader(name="authorization")String auth,
                                           @PathVariable(name="shopId")String shopId,
                                           @PathVariable(name="id")String id){
        return "Get it";
    }
    @GetMapping("/shops/{shopId}/aftersales/{id}/refunds")
    @ApiOperation(value="面向商铺：商铺根据商铺id和售后单id查询名下退款信息")
    public String getAfterSaleRefund(@RequestHeader(name="authorization")String auth,
                            @PathVariable(name="shopId")String shopId,
                            @PathVariable(name="id")String id){
        return "Get it";
    }
    @GetMapping("/orders/{id}/refunds")
    @ApiOperation(value="面向买家：买家根据自己名下的订单id查询退款信息")
    public String getOrderRefundsForCust(@RequestHeader(name="authorization")String auth,
                                    @PathVariable(name="id")String id){
        return "Get it";
    }
    @GetMapping("/aftersales/{id}/refunds")
    @ApiOperation(value="面向买家：买家根据自己名下的售后单id查询退款信息")
    public String getAftersaleRefundsForCust(@RequestHeader(name="authorization")String auth,
                                    @PathVariable(name="id")String id){
        return "Get it";
    }
}
