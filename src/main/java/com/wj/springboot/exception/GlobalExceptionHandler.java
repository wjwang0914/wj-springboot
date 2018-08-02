package com.wj.springboot.exception;

import com.wj.springboot.common.ResponseItem;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ControllerAdvice  处理controller所有没被try catch包裹的一个注解
 * 全局异常拦截
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseItem<Object> handlerException() {
        ResponseItem<Object> response = new ResponseItem<>();
        response.setStatus("error");
        response.setMessage("系统繁忙，请稍后再试");
        return response;
    }

    @ResponseBody
    @ExceptionHandler(BindException.class)
    public ResponseItem<Object> handlerValidException(BindingResult result) {
        ResponseItem<Object> response = new ResponseItem<>();
        response.setStatus("error");
        FieldError error = result.getFieldError();
        String field = error.getField();
        String code = error.getDefaultMessage();
        String message = String.format("%s:%s", field, code);
        response.setMessage(message);
        return response;
    }
}
