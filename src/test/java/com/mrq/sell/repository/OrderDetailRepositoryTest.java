package com.mrq.sell.repository;

import com.mrq.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    OrderDetailRepository detailRepository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("111112");
        orderDetail.setOrderId("111111");
        orderDetail.setProductId("111111");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductName("芝士蛋糕");
        orderDetail.setProductPrice(new BigDecimal(39.9));
        orderDetail.setProductQuantity(1);
        detailRepository.save(orderDetail);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> list = detailRepository.findByOrderId("111111");
        System.out.println(list);
    }
}