package com.trading.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trading.app.entity.Coin;
import com.trading.app.service.CoinService;

@RestController
@RequestMapping("/rest/db/")
public class Controller {
	
	@Autowired
	CoinService service;
	
	@GetMapping(value = "/{name}")
	public Coin get(@PathVariable final String name) {
		return service.findByName(name);
	}
	
	@PostMapping(value = "/add")
	public Coin add(@RequestBody final Coin coin) {
		return service.save(coin);
	}
	
	
	
	@GetMapping(value = "/get")
	public List<String> getAll() {
		return service.findAll()
				.stream()
				.map(coin -> coin.getName())
				.collect(Collectors.toList());
	}

}
