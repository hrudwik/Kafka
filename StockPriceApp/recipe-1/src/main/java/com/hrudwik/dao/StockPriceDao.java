package com.hrudwik.dao;

import com.hrudwik.domain.StockPrice;

import java.time.LocalDate;
import java.util.List;

public interface StockPriceDao {
    void insertStockPrice(StockPrice stockPrice);

    StockPrice selectStockPrice(String stockSymbol, LocalDate date);

    List<StockPrice> selectAllStockPrice();

    void deleteStockPrice(String stockSymbol, LocalDate date);
}
