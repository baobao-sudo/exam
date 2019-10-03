package com.uchain.exam.util;

import com.uchain.exam.VO.ResultVO;
import com.uchain.exam.enums.ResultEnum;
import lombok.Data;

/**
 * @author baobao
 * @date 2019
 */
@Data
public class ResultVOUtil {

    /**
     * 有残成功结果
     * @param object
     * @return
     */
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(ResultEnum resultEnum){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMsg());
        return  resultVO;
    }



}
