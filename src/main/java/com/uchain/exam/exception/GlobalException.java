package com.uchain.exam.exception;

import com.uchain.exam.enums.ResultEnum;

/**
 * @author baobao
 */
public class GlobalException extends RuntimeException {

    private ResultEnum resultEnum;

    public GlobalException(ResultEnum resultEnum){
        super();
        this.resultEnum =  resultEnum;
    }

}
