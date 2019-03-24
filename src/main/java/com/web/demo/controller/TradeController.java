package com.web.demo.controller;

import com.web.demo.pojo.Page;
import com.web.demo.pojo.Trade;
import com.web.demo.service.TradeService;
import com.web.demo.vo.result.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping(value = "/trade")
@Api(tags = "交易管理")
public class TradeController {

    @Autowired
    TradeService tradeService;
    @Autowired
    private RedisTemplate redisTemplate;

    @ApiOperation(value = "查询所有交易记录")
    @RequestMapping(name = "交易记录", value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public BaseResult<List<Trade>> selectTradeAll(Page page){
        BaseResult<List<Trade>> result = new BaseResult<>();
        try {
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
            result.setData(list);
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
