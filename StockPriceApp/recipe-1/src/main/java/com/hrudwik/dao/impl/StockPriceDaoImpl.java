package com.hrudwik.dao.impl;


import com.hrudwik.dao.StockPriceDao;
import com.hrudwik.dao.mybatis.mapper.StockPriceMapper;
import com.hrudwik.domain.StockPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository("stockPriceDao")
public class StockPriceDaoImpl implements StockPriceDao {

    @Autowired
    private StockPriceMapper stockPriceMapper;

    @Override
    public void insertStockPrice(StockPrice stockPrice) {
        stockPriceMapper.insertStockPrice(stockPrice);
    }

    @Override
    public StockPrice selectStockPrice(String stockSymbol, LocalDate date) {
         return stockPriceMapper.selectStockPrice(stockSymbol, date);
    }

    @Override
    public List<StockPrice> selectAllStockPrice() {
        return stockPriceMapper.selectAllStockPrice();
    }

    @Override
    public void deleteStockPrice(String stockSymbol, LocalDate date) {
        stockPriceMapper.deleteStockPrice(stockSymbol, date);
    }
}