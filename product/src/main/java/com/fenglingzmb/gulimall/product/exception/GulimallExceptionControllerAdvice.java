package com.fenglingzmb.gulimall.product.exception;

import com.fenglingzmb.common.exception.BizCodeEnum;
import com.fenglingzmb.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fenglingzmb
 * @date 2022/6/17
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.fenglingzmb.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题: {},异常类型为: {}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        // 获取校验错误的结果集
        Map<String, String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach((error) -> {
            String message = error.getDefaultMessage();
            String field = error.getField();
            map.put(field, message);
        });
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMessage()).put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        return R.error(BizCodeEnum.UNKNOWN_EXCEPTION.getCode(),BizCodeEnum.UNKNOWN_EXCEPTION.getMessage());
    }
}
