package com.uchain.exam.enums;


import lombok.Getter;

/**
 * @author baobao
 */

@Getter
public enum ResultEnum {
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
