package com.trading.app.service;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/*
 * demonstrates how service-specific properties can be injected
 */
@ConfigurationProperties(prefix = "custom.app.test", ignoreUnknownFields = false)
@Component
@Validated
public class ServiceProperties {

    @NotNull // you can also create configurationPropertiesValidator
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
