package com.example.demo.service;

import static com.example.demo.config.Translator.toLocale;
import static com.example.demo.util.TranslatorCode.GREETINGS;

import org.springframework.stereotype.Service;
@Service
public class TranslationService {
	
	public String getTranslation()
	{
		return toLocale(GREETINGS);
	}

}
