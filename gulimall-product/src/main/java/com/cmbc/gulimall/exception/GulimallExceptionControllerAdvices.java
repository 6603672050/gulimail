package com.cmbc.gulimall.exception;

import com.cmbc.gulimall.common.exception.BizCodeEnume;
import com.cmbc.gulimall.common.utils.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(basePackages = "com.cmbc.gulimall.controller")
public class GulimallExceptionControllerAdvices {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handValidException(MethodArgumentNotValidException e){
        BindingResult bindingResult = e.getBindingResult();
        Map<String,String> error = new HashMap<String, String>();
        bindingResult.getFieldErrors().forEach(item -> {
            error.put(item.getField(),item.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VAILD_EXCEPTION.getCode(),BizCodeEnume.VAILD_EXCEPTION.getMsg()).put("data",error);
    }
}
