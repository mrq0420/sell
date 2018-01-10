package com.mrq.sell.repository;

import com.mrq.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    private final String OPENID = "110111";

    @Autowired
    OrderMasterRepository masterRepository;

    @Test
    public void saveMaster(){
        OrderMaster master = new OrderMaster();
        master.setOrderId("111113");
        master.setBuyerAddress("北京市海淀区");
        master.setBuyerName("刘先生");
        master.setBuyerOpenid(OPENID);
        master.setBuyerPhone("1234567891");
        master.setOrderAmount(new BigDecimal(3.8));
        masterRepository.save(master);
        Assert.assertNotNull(master);
    }

    @Test
    public void findByBuyerOpenid() {

        PageRequest request = new PageRequest(0,1);

        Page<OrderMaster> page = masterRepository.findByBuyerOpenid(OPENID,request);
        System.out.println("总条数："+page.getSize());
        System.out.println("总页数："+page.getTotalPages());

    }
}