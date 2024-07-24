package com.softmelon.sofy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/HelloWorld")
public class HelloWorlController {

	@GetMapping
	public ResponseEntity<String> test() {
		return ResponseEntity.status(HttpStatus.OK).body("Hello world works!");
	}
}
