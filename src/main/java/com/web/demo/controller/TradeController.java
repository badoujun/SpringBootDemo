package com.web.demo.controller;

import com.terran4j.commons.api2doc.annotations.Api2Doc;
import com.terran4j.commons.api2doc.annotations.ApiComment;
import com.web.demo.pojo.Page;
import com.web.demo.pojo.Trade;
import com.web.demo.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.math.BigDecimal;
import java.util.List;

@Api2Doc(id = "TradeController", name = "交易接口")
@ApiComment(seeClass = Trade.class)
@Controller
@RequestMapping(value = "/trade")
public class TradeController {

    @Autowired
    TradeService tradeService;
    @Autowired
    private RedisTemplate redisTemplate;

    @ApiComment(value = "查询所有交易记录")
    @RequestMapping(name = "交易记录", value = "/list")
    @ResponseBody
    public List<Trade> selectTradeAll(@ApiComment(value = "分页对象",seeClass = Page.class)Page page){
        String request_key = "tradeList_" + page.getPageNum() + "_" + page.getPageSize();
        List<Trade> list = (List<Trade>)redisTemplate.opsForValue().get(request_key);
        if(list == null || list.size() == 0)
        {
            list = tradeService.select(page);
            redisTemplate.opsForValue().set(request_key,list);
            System.out.println("数据库查询");
        }else{
            System.out.println("redis查询");
        }
        return list;
    }
}
