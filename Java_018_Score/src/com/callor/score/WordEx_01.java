package com.callor.score;

import com.callor.score.impl.WordServiceImplV1A;
import com.callor.score.service.WordService;

public class WordEx_01 {

	public static void main(String[] args) {
		
		WordService wService = new WordServiceImplV1A();
		// wService.loadWord();
		wService.viewWord();
		
	}
	
}
