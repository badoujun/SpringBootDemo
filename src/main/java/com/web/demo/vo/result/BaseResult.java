package com.web.demo.vo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "返回结果")
public class BaseResult<T> implements Serializable {

    @ApiModelProperty("状态码: 1/2/3")
    private int statusCode;

    @ApiModelProperty("提示信息")
    private String message;

    @ApiModelProperty("业务数据")
    private T data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
