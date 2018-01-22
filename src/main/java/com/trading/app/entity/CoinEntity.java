package com.trading.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coin")
public class CoinEntity {
	
	@Id
    private String name;

	@Column
    private Long value;
	
	public CoinEntity() {
		
	}

	public CoinEntity(String name, Long value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
	
	

}
