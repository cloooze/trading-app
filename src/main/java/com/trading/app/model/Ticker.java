package com.trading.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {
	
	private String last;
	private String high;
	private String low;
	private String vwap;
	private String volume;
	private String bid;
	private String ask;
	private String timestamp;
	private String open;
	
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getVwap() {
		return vwap;
	}
	public void setVwap(String vwap) {
		this.vwap = vwap;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getAsk() {
		return ask;
	}
	public void setAsk(String ask) {
		this.ask = ask;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "Ticker [last=" + last + ", high=" + high + ", low=" + low + ", vwap=" + vwap + ", volume=" + volume
				+ ", bid=" + bid + ", ask=" + ask + ", timestamp=" + timestamp + ", open=" + open + "]";
	}
	

}
