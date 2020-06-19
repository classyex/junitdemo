package com.classyex.github.junitdemo.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Result.java <br>
 *
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 10:11 <br>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /**
     * 成功状态码
     */
    public static int SUCCESS_CODE = 0;
    /**
     * 成功消息提示
     */
    public static String SUCCESS_MSG = "OK";

    private int code;
    private String msg;
    private T data;

    public Result(T data) {
        this.msg = SUCCESS_MSG;
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result ok(Object object) {
        return new Result(SUCCESS_CODE, SUCCESS_MSG, object);
    }

    public static Result ok() {
        return ok(null);
    }

    public static Result error(Integer code, String msg) {
        return new Result(code, msg);
    }

}
