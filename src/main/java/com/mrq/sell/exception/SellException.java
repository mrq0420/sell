package com.mrq.sell.exception;

import com.mrq.sell.enums.ResultEnum;

public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }
}
