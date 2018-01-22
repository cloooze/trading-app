package com.trading.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trading.app.entity.Coin;
import com.trading.app.service.CoinService;

@RestController
@RequestMapping("/trading/")
public class Controller {
	
	@Autowired
	CoinService service;
	
//	public Controller(CoinRepository coinRepository) {
//        this.coinRepository = coinRepository;
//    }
	
	@RequestMapping(value = "/save/{name}/{value}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Coin saveCoin(@PathVariable final String name, @PathVariable final Long value) {
		
		return service.saveCoin(new Coin(name, value));
		
	}
	

}
