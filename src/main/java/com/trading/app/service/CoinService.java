package com.trading.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trading.app.entity.Coin;
import com.trading.app.repository.CoinRepository;

@Service
public class CoinService {
	
	@Autowired
	CoinRepository coinRepository;
	
	public Coin saveCoin(Coin coin) {
		return coinRepository.save(coin);
	}
	
	

}
