package com.naveen.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class StockInfo implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer stockInfoId;
	private String companyName;
	private String marketName;
	private Integer shareValue;
	public StockInfo(Integer stockInfoId, String marketName, String companyName, Integer shareValue) {
		super();
		this.stockInfoId = stockInfoId;
		this.marketName = marketName;
		this.companyName = companyName;
		this.shareValue = shareValue;
	}
	public StockInfo() {
		super();
	}
	public Integer getStockInfoId() {
		return stockInfoId;
	}
	public void setStockInfoId(Integer stockInfoId) {
		this.stockInfoId = stockInfoId;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getShareValue() {
		return shareValue;
	}
	public void setShareValue(Integer shareValue) {
		this.shareValue = shareValue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StockInfo [stockInfoId=" + stockInfoId + ", marketname=" + marketName + ", companyname=" + companyName
				+ ", shareValue=" + shareValue + "]";
	}
	
	

}
