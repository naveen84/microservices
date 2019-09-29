package com.naveen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.naveen.model.StockInfo;

@Repository
public interface StockInfoDao extends JpaRepository<StockInfo, Integer>{
	
	//@Query(value = "select share_value from stock_info where market_name=?1 and company_name=?2" , nativeQuery = true)
	StockInfo findByMarketNameAndCompanyName(String marketName,String companyName);
}
