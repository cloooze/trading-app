package com.trading.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.app.entity.CoinEntity;

public interface CoinRepository extends JpaRepository<CoinEntity, Long> {

    CoinEntity save(CoinEntity cointEntity);

    CoinEntity findByName(String name);

}

