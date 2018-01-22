package com.trading.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(value = "/save/{name}/{value}")
	public Coin saveCoin(@PathVariable final String name, @PathVariable final Long value) {
		return service.save(new Coin(name, value));
	}
	
	@GetMapping(value = "/get/{name}")
	public Coin getCoin(@PathVariable final String name) {
		return service.findByName(name);
	}
	
	@GetMapping(value = "/get")
	public List<String> getAll() {
		return service.findAll()
				.stream()
				.map(coin -> coin.getName())
				.collect(Collectors.toList());
	}

}
