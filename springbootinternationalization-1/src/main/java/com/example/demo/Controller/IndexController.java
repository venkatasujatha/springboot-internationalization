package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TranslationService;

@RestController
public class IndexController {
	
	@Autowired
	private TranslationService service;
	
	@GetMapping("/translation")
	public ResponseEntity<String> getIndex()
		
	{
		String translation = service.getTranslation();
		return ResponseEntity.ok(translation);
	}

}
