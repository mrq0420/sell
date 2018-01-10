package com.mrq.sell.service.ServiceImpl;

import com.mrq.sell.dataobject.ProductCategory;
import com.mrq.sell.service.ProductCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryService productCategoryService;

    @Test
    public void findOne() {
        ProductCategory result = productCategoryService.findOne(1);
        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findAll() {
        List<ProductCategory> result = productCategoryService.findAll();
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(4,5);
        List<ProductCategory> result = productCategoryService.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("酱油",5);
        productCategoryService.save(productCategory);
        Assert.assertNotEquals(null,productCategory);
    }
}