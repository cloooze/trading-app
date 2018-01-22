package com.trading.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coin")
public class Coin {
	
	@Id
    private String name;

	@Column(name = "curr_value")
    private Long currentValue;
	
	@Column(name = "prev_value")
    private Long previousValue;
	
	public Long getPreviousValue() {
		return previousValue;
	}

	public void setPreviousValue(Long previousValue) {
		this.previousValue = previousValue;
	}

	public Coin() {}

	public Coin(String name, Long value) {
		super();
		this.name = name;
		this.currentValue = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getValue() {
		return currentValue;
	}

	public void setValue(Long value) {
		this.currentValue = value;
	}
	
	

}
