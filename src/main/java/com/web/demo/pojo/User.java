package com.web.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户实体")
public class User {
    @ApiModelProperty("用户ID")
    private int id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("年龄")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
