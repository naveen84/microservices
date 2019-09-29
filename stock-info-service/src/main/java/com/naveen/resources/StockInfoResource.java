package com.naveen.resources;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.dao.StockInfoDao;
import com.naveen.model.StockInfo;
import com.naveen.response.StockInfoResponse;

@RestController
public class StockInfoResource {
	
	
	private static final Logger log = LoggerFactory.getLogger(StockInfoResource.class);

	@Autowired
	private StockInfoDao stockInfoDao;
	@Autowired
	private Environment environment;
	
	@GetMapping("/market/{marketname}/company/{companyname}")
	public StockInfoResponse getShareValue(@PathVariable("marketname")String marketName,@PathVariable("companyname")String companyName) {
		log.debug("<<MARKETNAME>>",marketName ,"<<COMPANYNAME>>",companyName);
		StockInfo stockInfo = stockInfoDao.findByMarketNameAndCompanyName(marketName, companyName);
		StockInfoResponse stockInfoResponse =null;
		if(stockInfo!=null)
		{
			stockInfoResponse = new StockInfoResponse();
			stockInfoResponse.setMsg("success");
			stockInfoResponse.setStatusCode(HttpStatus.OK.value());
			stockInfoResponse.setStockValue(stockInfo.getShareValue());
			stockInfoResponse.setPortNum(Integer.parseInt(environment.getProperty("local.server.port")));
		}
		else {
			stockInfoResponse = new StockInfoResponse();
			stockInfoResponse.setMsg("STOCK NOT FOUND");
			stockInfoResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
			stockInfoResponse.setStockValue(0);
			stockInfoResponse.setPortNum(Integer.parseInt(environment.getProperty("local.server.port")));
		}
		log.debug("<<SAHRE VALUE>>",stockInfo);
		log.debug("<<stockInfoResponse>>",stockInfoResponse);
		return stockInfoResponse;
	}
}
