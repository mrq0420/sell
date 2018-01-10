package com.mrq.sell.service.ServiceImpl;

import com.mrq.sell.dataobject.ProductInfo;
import com.mrq.sell.enums.ProductStatusEnum;
import com.mrq.sell.service.ProductInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    ProductInfoService productInfoService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productInfoService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> list  = productInfoService.findUpAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> page = productInfoService.findAll(pageRequest);
        System.out.println(page.getTotalElements());
        Iterator<ProductInfo> iterator = page.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Assert.assertNotEquals(0,page.getSize());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("111111");
        productInfo.setProductName("芝士蛋糕");
        productInfo.setProductStock(66);
        productInfo.setProductPrice(new BigDecimal(39.9));
        productInfo.setCategoryType(3);
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setProductDescription("轻柔，丝滑");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfoService.save(productInfo);
        Assert.assertNotNull(productInfo);
    }
}