package com.trading.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.trading.app.model.Ticker;

@Component
public class ScheduledTask {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

//    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        Ticker ticker = new RestTemplate().getForObject(
				"https://www.bitstamp.net/api/ticker/", Ticker.class);
		log.info(ticker.toString());
    }
}
