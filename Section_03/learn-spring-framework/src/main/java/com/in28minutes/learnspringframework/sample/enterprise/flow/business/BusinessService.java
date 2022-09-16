package com.in28minutes.learnspringframework.sample.enterprise.flow.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.sample.enterprise.flow.data.DataSevice;

@Component
public class BusinessService {
	
	@Autowired
	private DataSevice dataSevice;
	
	public long calculateSum() {
		return dataSevice.retrieveData().stream().reduce(Integer::sum).get();
	}
	
}
