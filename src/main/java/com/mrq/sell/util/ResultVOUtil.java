package com.mrq.sell.util;

import com.mrq.sell.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setMessage("成功");
        resultVO.setCode(0);
        resultVO.setData(data);
        return resultVO;
    }

    public static ResultVO success() {return success(null);}

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();

        resultVO.setCode(code);
        resultVO.setMessage(msg);
        return resultVO;
    }
}
