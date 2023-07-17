package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("company")
@ConfigurationProperties(prefix = "com.nt1")
public class Company {
	
	private Integer Id;
	private String name;
	private String address;
	private Integer employee1;

}
