package com.yangk.product.utils;

import com.yangk.product.domain.vo.ResultVO;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/6
 * @Version 1.0
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
