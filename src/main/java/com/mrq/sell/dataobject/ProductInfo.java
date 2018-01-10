package com.mrq.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mrq.sell.enums.ProductStatusEnum;
import com.mrq.sell.util.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId; //商品id

    private String productName; //商品名称

    private BigDecimal productPrice; //商品价格

    private Integer productStock; //商品库存

    private String productDescription; //商品描述

    private String productIcon; //商品小图

    private Integer productStatus = ProductStatusEnum.UP.getCode(); //状态 0:正常 1:下架

    private Integer categoryType; //类目编号

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
