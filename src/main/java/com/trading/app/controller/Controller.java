package com.trading.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.trading.app.domain.Coin;
import com.trading.app.domain.RestErrorInfo;
import com.trading.app.exception.ResourceNotFoundException;
import com.trading.app.service.CoinService;

@RestController
@RequestMapping("/rest/db/")
public class Controller {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());
			
	@Autowired
	CoinService service;
	
	@GetMapping(value = "/get/{name}")
	public Coin get(@PathVariable final String name) {
		Coin coin =  service.findByName(name);
		if (coin == null)
			throw new ResourceNotFoundException("Non ho trovato il coin con il nome " + name);
		return coin;
	}
	
	@PostMapping(value = "/add")
	public Coin add(@RequestBody final Coin coin, HttpServletRequest request, HttpServletResponse response) {
		return service.save(coin);
	}
	
	@GetMapping(value = "/getAll")
	public List<Coin> getAll() {
		log.info("getAll invocato");
//		return service.findAll()
//				.stream()
//				.map(coin -> coin.getName())
//				.collect(Collectors.toList());
		return service.findAll();
	}
	
	//Exception handler - move to AbstractController
	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public
    @ResponseBody
    RestErrorInfo handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request, HttpServletResponse response) {
        log.info("ResourceNotFoundException handler:" + ex.getMessage());

        return new RestErrorInfo(ex, "Sorry I couldn't find it.");
    }

}
