package com.trading.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.app.domain.Coin;

public interface CoinRepository extends JpaRepository<Coin, Long> {

    Coin save(Coin cointEntity);

    Coin findByName(String name);
    
    List<Coin> findAll();
    
}

