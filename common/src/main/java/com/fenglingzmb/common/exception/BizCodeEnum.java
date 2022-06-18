package com.fenglingzmb.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fenglingzmb
 * @date 2022/6/17
 */
@Getter
@AllArgsConstructor
public enum BizCodeEnum {
    UNKNOWN_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001,"参数格式校验失败");

    private int code;
    private String message;
}
