package com.mrq.sell.VO;

import lombok.Data;

@Data
public class ResultVO<T> {

    /* 错误码 */
    private Integer code;

    /* 错误信息 */
    private String message;

    /* 对象 */
    private T data;
}
