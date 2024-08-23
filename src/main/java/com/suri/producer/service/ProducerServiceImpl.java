package com.suri.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService{
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Value("${kafka.stry.topic}")
	private String testTopic;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void sendMsgtoTopic(String employeeStory, String employeeKey) {
		try {
			kafkaTemplate.send(testTopic, employeeKey, employeeStory);
			
		} catch(Exception e) {
			log.error("Error while sending data {} ", e.getMessage());
			throw e;
		}
		
	}

}
