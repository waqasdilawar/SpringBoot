package com.boot.dasboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class DasBootApplication {

	@Bean(name="dealerCentralDataSource")
	@ConfigurationProperties(prefix = "dealer.central.datasource")
	public DataSource dealerCentralDataSource(){
		return DataSourceBuilder.create().build();
	}

	@Bean(name="dealerCentralJdbcTemplate")
	public JdbcTemplate dealerCentralJdbcTemplate(){
		return new JdbcTemplate(dealerCentralDataSource());
	}
	public static void main(String[] args) {
		SpringApplication.run(DasBootApplication.class, args);
	}
}
