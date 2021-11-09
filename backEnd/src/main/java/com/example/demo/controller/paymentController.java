package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.payment.PaymentVo;
import com.example.demo.model.refund.RefundVo;
import com.example.demo.utils.ResponseCode;
import com.example.demo.utils.ReturnObject;
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
    public ReturnObject<PaymentVo> getPaymentsState(){
        return new ReturnObject<PaymentVo>();
    }
    @GetMapping("/patterns")
    @ApiOperation(value="获取所有的支付渠道")
    public Object getPaymentsPatterns(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("001","积点支付");
        jsonObject.put("002","模拟渠道支付");
        return jsonObject;
    }
    @PostMapping("/user/orders/{id}")
    @ApiOperation(value="面向买家：买家为订单创建支付单")
    public ReturnObject<ResponseCode> createPayment(@RequestHeader(name="authorization")String auth,
                                                    @PathVariable(name="id")String id,
                                                    @RequestBody PaymentVo payment) {
        return new ReturnObject<ResponseCode>();
    }
    @GetMapping("/user/orders/{id}")
    @ApiOperation(value="面向买家：买家根据订单id获取支付信息")
    public ReturnObject<PaymentVo> createPayment(@RequestHeader(name="authorization")String auth,
                                @PathVariable(name="id")String id) {
        return new ReturnObject<PaymentVo>();
    }
    @GetMapping("/shop/{shopId}/orders/{id}/payments")
    @ApiOperation(value="面向商铺：商铺根据商铺id和订单id查询自己名下订单的支付信息")
    public ReturnObject<PaymentVo> getShopCertainOrderPayment(@RequestHeader(name="authorization")String auth,
                                             @PathVariable(name="shopId")String shopId,
                                             @PathVariable(name="id")String id){
        return new ReturnObject<PaymentVo>();
    }
    @PostMapping("/user/aftersales/{id}/payments")
    @ApiOperation(value="面向买家：买家为售后订单创建支付单")
    public ReturnObject<ResponseCode> getAftersalesPayments(@RequestHeader(name="authorization")String auth,
                                        @PathVariable(name="id")String id,
                                        @RequestBody PaymentVo payment){
        return new ReturnObject<ResponseCode>();
    }
    @GetMapping("/user/aftersales/{id}/payments")
    @ApiOperation(value="面向买家：买家根据售后订单id查询支付单")
    public ReturnObject<PaymentVo> getAftersalesPayments(@RequestHeader(name="authorization")String auth,
                                        @PathVariable(name="id")String id){
        return new  ReturnObject<PaymentVo>();
    }
    @GetMapping("/shops/{shopId}/aftersales/{id}/payments")
    @ApiOperation(value="面向商铺：商铺根据商铺id和售后订单id查询名下的售后订单支付信息")
    public ReturnObject<PaymentVo> getShopAfterSalePayments(@RequestHeader(name="authorization")String auth,
                                           @PathVariable(name="shopId")String shopId,
                                           @PathVariable(name="id")String id){
        return new ReturnObject<PaymentVo>();
    }
    @PostMapping("/shops/{shopId}/payments/{id}/refunds")
    @ApiOperation(value="面向商铺：商铺根据商铺id和支付id，对自己名下的已支付支付单发起退款")
    public ReturnObject<ResponseCode> submitRefund(@RequestHeader(name="authorization")String auth,
                                           @PathVariable(name="shopId")String shopId,
                                           @PathVariable(name="id")String id,
                                           @RequestBody RefundVo refund){
        return new ReturnObject<ResponseCode>();
    }
    @GetMapping("/shops/{shopId}/orders/{id}/refunds")
    @ApiOperation(value="面向商铺：商铺根据商铺id和订单id查询名下退款信息")
    public ReturnObject<PaymentVo> getOrderRefund(@RequestHeader(name="authorization")String auth,
                                           @PathVariable(name="shopId")String shopId,
                                           @PathVariable(name="id")String id){
        return new ReturnObject<PaymentVo>();
    }
    @GetMapping("/shops/{shopId}/aftersales/{id}/refunds")
    @ApiOperation(value="面向商铺：商铺根据商铺id和售后单id查询名下退款信息")
    public ReturnObject<PaymentVo> getAfterSaleRefund(@RequestHeader(name="authorization")String auth,
                            @PathVariable(name="shopId")String shopId,
                            @PathVariable(name="id")String id){
        return new ReturnObject<PaymentVo>();
    }
    @GetMapping("/user/orders/{id}/refunds")
    @ApiOperation(value="面向买家：买家根据自己名下的订单id查询退款信息")
    public ReturnObject<PaymentVo> getOrderRefundsForCust(@RequestHeader(name="authorization")String auth,
                                    @PathVariable(name="id")String id){
        return new ReturnObject<PaymentVo>();
    }
    @GetMapping("/user/aftersales/{id}/refunds")
    @ApiOperation(value="面向买家：买家根据自己名下的售后单id查询退款信息")
    public ReturnObject<PaymentVo> getAftersaleRefundsForCust(@RequestHeader(name="authorization")String auth,
                                    @PathVariable(name="id")String id){
        return new ReturnObject<PaymentVo>();
    }
    @PostMapping("/shop/{shopId}/deposit")
    @ApiOperation(value="面向商铺：卖家根据商铺id缴纳保证金")
    public ReturnObject<PaymentVo> submitShopDepositPayment(@RequestHeader(name="authorization")String auth
                                                            ,@RequestParam(name="amount")double amount){
        PaymentVo paymentVo=new PaymentVo();
        paymentVo.setDueAmount(amount);
        return new ReturnObject<PaymentVo>(paymentVo);
    }
}
