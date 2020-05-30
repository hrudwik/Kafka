package com.hrudwik.domain;

import java.time.LocalDate;
import java.util.Objects;

public class StockPrice {
    private String stockSymbol;
    private LocalDate date;
    private Double price;

    public StockPrice() {
    }

    public StockPrice(String stockSymbol, LocalDate date, Double price) {
        this.stockSymbol = stockSymbol;
        this.date = date;
        this.price = price;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockPrice that = (StockPrice) o;
        return Objects.equals(stockSymbol, that.stockSymbol) &&
                Objects.equals(date, that.date) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockSymbol, date, price);
    }

    @Override
    public String toString() {
        return "StockPrice{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
