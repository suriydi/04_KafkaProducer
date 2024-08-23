package com.suri.producer.service;

import org.springframework.stereotype.Service;

@Service
public interface ProducerService {
	
	public void sendMsgtoTopic(String employee, String employeeKey);

}
