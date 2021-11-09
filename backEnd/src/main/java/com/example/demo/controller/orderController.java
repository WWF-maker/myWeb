package com.example.demo.controller;

import com.example.demo.model.order.OrderVo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
@RequestMapping("/order")
@Api(value="订单模块API",tags="订单模块API")
@CrossOrigin
public class orderController {
    //面向用户
    @GetMapping("/user")
    @ApiOperation(value="面向用户：查询用户名下所有订单")
    public String getOrders(@RequestHeader(name="authorization")String auth,
                            @RequestParam("state")String state) {
        return state;
    }
    @PostMapping("/user")
    @ApiOperation(value="面向用户：用户提交订单")
    public String submitNewOrder(@RequestHeader(name="authorization")String auth,
                                 @RequestBody OrderVo order) {
        return order.toString();
    }
    @GetMapping("/user/{id}")
    @ApiOperation(value="面向用户：用户通过订单id查询特定订单详细信息")
    public String getCertainOrder(@RequestHeader(name="authorization")String auth,
                                  @PathVariable(name="id") String id){
        return id;
    }
    @PutMapping("/user/{id}")
    @ApiOperation(value="面向用户：用户通过订单id修改特定订单详细信息")
    public String alterCertainOrder(@RequestHeader(name="authorization")String auth,
                                    @PathVariable String id,@RequestBody OrderVo order){
        return id;
    }
    @DeleteMapping("/user/{id}")
    @ApiOperation(value="面向用户：用户通过订单id删除特定订单详细信息")
    public String delCertainOrder(@RequestHeader(name="authorization")String auth,
                                  @PathVariable(name="id") String id){
        return id;
    }
    @PutMapping("/user/{id}/confirm")
    @ApiOperation(value="面向用户：用户通过订单id修改名下订单状态为确认收货")
    public String confirmOrders(@RequestHeader(name="authorization")String auth,
                                @PathVariable(name="id") String id){
        return id;
    }
    @PutMapping("/user/{id}/groupon-normal")
    @ApiOperation(value="面向用户：用户通过订单id修改名下团购订单为普通订单")
    public String grouponToNormal(@RequestHeader(name="authorization")String auth,
                                  @PathVariable(name="id") String id){
        return id;
    }
    //面向商铺
    @GetMapping("/shop/{shopId}/orders")
    @ApiOperation(value="面向商铺：查询商铺名下所有订单")
    public String getShopOrders(@RequestHeader(name="authorization")String auth,
                                @PathVariable(name="shopId") String shopId,
                                @RequestParam(name="customerId")String customerId,
                                @RequestParam(name="state")String state){
        return "Get it";
    }
    @GetMapping("/shop/{shopId}/orders/{id}")
    @ApiOperation(value="面向商铺：店铺根据订单id查询名下特定订单详细信息")
    public String getCertainShopOrder(@RequestHeader(name="authorization")String auth,
                                      @PathVariable(name="shopId") String shopId,
                                      @PathVariable(name="id") String id)
    {
        return "Get it";
    }
    @PutMapping("/shop/{shopId}/orders/{id}")
    @ApiOperation(value="面向商铺：店铺根据订单id修改名下特定订单详细信息")
    public String alterCertainShopOrder(@RequestHeader(name="authorization")String auth,
                                        @PathVariable(name="shopId") String shopId,
                                        @PathVariable(name="id") String id)
    {
        return "Get it";
    }
    @DeleteMapping("/shop/{shopId}/orders/{id}")
    @ApiOperation(value="面向商铺：店铺根据订单id删除订单")
    public String delCertainShopOrder(@RequestHeader(name="authorization")String auth,
                                      @PathVariable(name="shopId") String shopId,
                                      @PathVariable(name="id") String id)
    {
        return "Get it";
    }
    @PutMapping("/shop/{shopId}/orders/{id}/deliver")
    @ApiOperation(value="面向商铺：商铺根据订单id标记名下订单已发货")
    public String delivered(@RequestHeader(name="authorization")String auth,
                            @PathVariable(name="shopId") String shopId,
                            @PathVariable(name="id") String id){
        return "Get it";
    }
}
