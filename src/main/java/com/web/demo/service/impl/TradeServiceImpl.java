package com.web.demo.service.impl;

import com.web.demo.dao.TradeDao;
import com.web.demo.pojo.Trade;
import com.web.demo.pojo.TradeExample;
import com.web.demo.service.TradeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {
    @Resource
    TradeDao tradeDao;

    @Override
    public List<Trade> select() {
        TradeExample example = new TradeExample();
        example.setOffset(0l);
        example.setLimit(1);
        return tradeDao.selectByExample(example);
    }
}
