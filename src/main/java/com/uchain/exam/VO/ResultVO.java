package com.uchain.exam.VO;

import lombok.Data;

/**
 * @author baobao
 * @param <T>
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;
}
