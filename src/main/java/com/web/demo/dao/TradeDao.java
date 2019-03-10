package com.web.demo.dao;

import com.web.demo.pojo.Trade;
import com.web.demo.pojo.TradeExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * TradeDao继承基类
 */
@Mapper
public interface TradeDao extends MyBatisBaseDao<Trade, Long, TradeExample> {
}