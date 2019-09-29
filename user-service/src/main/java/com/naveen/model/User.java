package com.naveen.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer userId;
	private String username;
	private String city;
	private String email;
	private String mobilenumber;
	@Transient
	private BigDecimal investmentAmount;
	@Transient
	private BigDecimal totalBalance;
	
	
	public User() {
		super();
	}
	public User(Integer userId, String username, String city, String email, String mobilenumber,
			BigDecimal investmentAmount, BigDecimal totalBalance) {
		super();
		this.userId = userId;
		this.username = username;
		this.city = city;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.investmentAmount = investmentAmount;
		this.totalBalance = totalBalance;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public BigDecimal getInvestmentAmount() {
		return investmentAmount;
	}
	public void setInvestmentAmount(BigDecimal investmentAmount) {
		this.investmentAmount = investmentAmount;
	}
	public BigDecimal getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(BigDecimal totalBalance) {
		this.totalBalance = totalBalance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", city=" + city + ", email=" + email
				+ ", mobilenumber=" + mobilenumber + ", investmentAmount=" + investmentAmount + ", totalBalance="
				+ totalBalance + "]";
	}
}
