package com.trading.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trading.app.entity.CoinEntity;
import com.trading.app.repository.CoinRepository;

@RestController
@RequestMapping("/trading/")
public class Controller {
	
	CoinRepository coinRepository;
	
	public Controller(CoinRepository coinRepository) {
        this.coinRepository = coinRepository;
    }
	
	@RequestMapping(value = "/save/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String saveCoin(@PathVariable final String name) {
		
		coinRepository.save(new CoinEntity("bitcoin", new Long(33)));
		
		return "Ok";
		
	}
	

}
