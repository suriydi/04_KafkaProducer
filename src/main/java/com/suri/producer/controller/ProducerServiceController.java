package com.suri.producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import com.suri.producer.model.EmployeeStory;
import com.suri.producer.service.ProducerService;

@RestController
public class ProducerServiceController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ProducerService producerService;
	
	@PostMapping(value="/pushEmpStory")
	@ResponseBody
	public ResponseEntity<String> sendMsgToTopic(@RequestBody EmployeeStory employeeStory){
		try {
			log.info("The Json data of Emp is, {} ",employeeStory.toString());
			producerService.sendMsgtoTopic(new Gson().toJson(employeeStory).toString(), employeeStory.getEmployeeId().toString());
			return ResponseEntity.ok().body("SUCCESS");
		}catch(Exception exp) {
			log.error("Unable to send the data to topic, something went wrong: {} ", exp.getMessage());
			return ResponseEntity.internalServerError().body("FAILED");
		}
		
	}

}
