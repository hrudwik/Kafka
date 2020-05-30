package com.hrudwik;

import com.hrudwik.dao.StockPriceDao;
import com.hrudwik.domain.StockPrice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class KafkaApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(KafkaApplication.class, args);
		StockPriceDao stockPriceDao = applicationContext.getBean("stockPriceDao", StockPriceDao.class);
		StockPrice stockPrice = new StockPrice("APPLE", LocalDate.now(), 89.00);
		stockPriceDao.insertStockPrice(stockPrice);
		LOGGER.info("Stock prices retrieved from DB {}", stockPriceDao.selectAllStockPrice());
		stockPriceDao.deleteStockPrice(stockPrice.getStockSymbol(), stockPrice.getDate());
	}

}
