package com.mrq.sell.dataobject;

import com.mrq.sell.enums.OrderStatusEnum;
import com.mrq.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount; //订单总金额

    /* 订单状态 默认为新订单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;


}
