package com.nt.sbeans;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("employee")
@Data
@ConfigurationProperties(prefix = "com.nt1")
public class Employee {
	private Integer eId;
	private List<String> eName;
	private Set<String> Address1;
	private Company company;
	
	

}
