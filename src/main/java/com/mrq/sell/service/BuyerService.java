package com.mrq.sell.service;

import com.mrq.sell.DTO.OrderDTO;

import java.util.List;

public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    OrderDTO cancelOrder(String openid,String orderId);


}
