package com.web.demo.service;

import com.web.demo.pojo.Page;
import com.web.demo.pojo.Trade;

import java.util.List;

public interface TradeService {
    List<Trade> select(Page page);
}
