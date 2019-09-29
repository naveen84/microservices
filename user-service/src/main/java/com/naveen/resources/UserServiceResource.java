package com.naveen.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.restclient.StockInfoResponse;
import com.naveen.restclient.StockInfoServiceClient;

@RestController
public class UserServiceResource {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceResource.class);

	@Autowired
	private StockInfoServiceClient serviceClient;
	
	@GetMapping("feign/market/{marketname}/company/{companyname}")
	public StockInfoResponse getStockInfo(@PathVariable("marketname")String marketName,@PathVariable("companyname")String companyName) {
		log.debug("<< INSIDE USERSERVICERESOURCE >>");
		StockInfoResponse  stockInfo =serviceClient.getShareValue(marketName, companyName);
		return stockInfo;
		
	}
}
