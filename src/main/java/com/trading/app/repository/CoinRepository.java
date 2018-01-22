package com.trading.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.app.entity.Coin;

public interface CoinRepository extends JpaRepository<Coin, Long> {

    Coin save(Coin cointEntity);

    Coin findByName(String name);

}

