package com.web.demo.controller;

import com.web.demo.pojo.User;
import com.web.demo.service.UserService;
import com.web.demo.vo.result.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    @ApiIgnore
    public String hello(){
        return "Hello, This is Spring Boot";
    }

    @RequestMapping("/api")
    @ResponseBody
    @ApiIgnore
    public String api(){
        return "This is API result!";
    }

    @RequestMapping("/user")
    @ApiIgnore
    public String user(Model model){
        model.addAttribute("list",userService.select());
        return "user";
    }

    @RequestMapping(name = "查询所有用户", value = "/list")
    @ResponseBody
    @ApiOperation("查询所有用户")
    public BaseResult<List<User>> list(){
        BaseResult<List<User>> result = new BaseResult<>();
        try {
            result.setData(userService.select());
            result.setStatusCode(1);
            result.setMessage("success");
        }catch (Exception e){
            e.printStackTrace();
            result.setStatusCode(2);
            result.setMessage("error");
        }
        return result;
    }
}
