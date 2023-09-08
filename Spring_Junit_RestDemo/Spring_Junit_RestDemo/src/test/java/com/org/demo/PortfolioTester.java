package com.org.demo;

//import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.yaml.snakeyaml.tokens.AliasToken;
class PortfolioTester {
	
	//SuppressWarnings("unused")
		Portfolio portf = new Portfolio();
		
		//create the mock object of stockservice
		StockService stok = mock(StockService.class);
		
	public void setup() {
	
	//set the stockservice to the portfolio
	portf.setStockService(stok);
	}
	
	

	@Test
	boolean testMarketValue() {
		List<Stock> stocks=new ArrayList<>();
		Stock googleStock =new Stock("1","Google",10);
		Stock microsoftStock =new Stock("2","Microsoft",100);
		stocks.add(googleStock);
		stocks.add(microsoftStock);
		
		
		//mock behavior
		portf.setStocks(stocks);
		
		when(stok.getPrice(googleStock)).thenReturn((int)50.00);
		when(stok.getPrice(microsoftStock)).thenReturn(10000);
		
		double marketValue = portf.getMarketValue();
        return marketValue == 100800.0;

	}
	
	

}
