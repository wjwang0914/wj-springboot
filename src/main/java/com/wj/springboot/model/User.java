package com.wj.springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class User {

    @NotEmpty(message = "用户名不能为空")
    @Size(min = 2, max = 10, message = "用户名的长度2-8位")
    private String userName;
    private long userId;

}
