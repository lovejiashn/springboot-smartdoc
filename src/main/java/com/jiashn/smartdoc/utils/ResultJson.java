package com.jiashn.smartdoc.utils;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: jiangjs
 * @description:
 * @date: 2021/8/30 14:04
 */
@Data
@Accessors(chain = true)
public class ResultJson<T> {
    /**
     * 操作结果编码：200:成功 500：报错
     */
    private int code;
    /**
     * 结果描述
     */
    private String msg;
    /**
     * 结果状态 true:成功 false:失败
     */
    private Boolean status;
    /**
     * 返回操作结果
     */
    private T data;

    public static <T> ResultJson<T> success(T t){
        return new ResultJson<T>()
                .setStatus(Boolean.TRUE)
                .setCode(200)
                .setMsg("成功")
                .setData(t);
    }
    public static <T> ResultJson<T> success(int code,String msg,T t){
        return new ResultJson<T>()
                .setMsg(msg)
                .setCode(code)
                .setStatus(Boolean.TRUE)
                .setData(t);
    }

    public static ResultJson error(int code,String msg){
        return new ResultJson<>()
                .setCode(code)
                .setMsg(msg)
                .setStatus(Boolean.FALSE);
    }

}
