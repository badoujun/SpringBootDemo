package com.web.demo.controller;

import com.terran4j.commons.api2doc.annotations.Api2Doc;
import com.terran4j.commons.api2doc.annotations.ApiComment;
import com.web.demo.pojo.Page;
import com.web.demo.pojo.Trade;
import com.web.demo.service.TradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Api2Doc(id = "TradeController", name = "交易接口")
@ApiComment(seeClass = Trade.class)
@Controller
@RequestMapping(value = "/trade")
public class TradeController {

    @Resource
    TradeService tradeService;

    @ApiComment(value = "查询所有交易记录")
    @RequestMapping(name = "交易记录", value = "/list")
    @ResponseBody
    public List<Trade> selectTradeAll(@ApiComment(value = "分页对象",seeClass = Page.class)Page page){
        return tradeService.select(page);
    }
}
