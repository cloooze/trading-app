package com.trading.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trading.app.entity.Coin;
import com.trading.app.repository.CoinRepository;

@Service
public class CoinService {
	
	@Autowired
	CoinRepository coinRepository;
	
	public Coin save(Coin coin) {
		return coinRepository.save(coin);
	}
	
	public Coin findByName(String name) {
		return coinRepository.findByName(name);
	}
	
	public List<Coin> findAll() {
		return coinRepository.findAll();
	}
	

}
