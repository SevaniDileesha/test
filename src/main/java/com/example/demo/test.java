package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

	@RequestMapping(path = "/transactions/getTransfers", method = RequestMethod.POST)
	public String getTransfers() {
	return "hello";
	}
}
