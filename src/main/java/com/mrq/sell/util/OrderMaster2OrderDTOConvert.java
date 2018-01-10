package com.mrq.sell.util;

import com.mrq.sell.DTO.OrderDTO;
import com.mrq.sell.dataobject.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConvert {

    public static OrderDTO convert(OrderMaster orderMaster){

        OrderDTO orderDTO = new OrderDTO();

        BeanUtils.copyProperties(orderMaster,orderDTO);

        return orderDTO;
    }

    public static List<OrderDTO> listConvert(List<OrderMaster> orderMasterList){

        return orderMasterList.stream().map(e ->
                convert(e))
                .collect(Collectors.toList());

    }
}
