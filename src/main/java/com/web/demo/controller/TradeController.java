package com.web.demo.controller;

import com.web.demo.service.TradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TradeController {

    @Resource
    TradeService tradeService;

    @RequestMapping("/trade")
    public String user(Model model){
        model.addAttribute("list",tradeService.select());
        return "trade";
    }
}
