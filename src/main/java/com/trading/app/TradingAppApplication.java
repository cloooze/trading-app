package com.trading.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.trading.app")
@EnableJpaRepositories(basePackages = "com.trading.app.repository")
public class TradingAppApplication {
	
	private static final Logger log = LoggerFactory.getLogger(TradingAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TradingAppApplication.class, args);
	}
	
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Ticker quote = restTemplate.getForObject(
//					"https://www.bitstamp.net/api/ticker/", Ticker.class);
//			log.info(quote.toString());
//		};
//	}
	
//	@Autowired
//	YAMLConfig config;
//	
//	CoinRepository coinRepository;
//	
//	
//	@Bean
//	public CommandLineRunner run() throws Exception {
//		return args -> {
//			coinRepository = new CoinRepo
//			log.info(config.getName() + " - " + config.getPort());
//			log.info("database access: " + coinRepository.save(new CoinEntity("bitocin", new Long(50))));
//		};
//	}
	
}
