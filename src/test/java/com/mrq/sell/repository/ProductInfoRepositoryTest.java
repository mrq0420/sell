package com.mrq.sell.repository;

import com.mrq.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋瘦肉粥");
        productInfo.setProductStock(100);
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setCategoryType(2);
        productInfo.setProductStatus(0);
        productInfo.setProductDescription("就是一杯粥");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfoRepository.save(productInfo);
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> result = productInfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0,result.size());
        System.out.println(result);
    }
}