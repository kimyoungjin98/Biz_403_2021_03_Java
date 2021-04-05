package com.callor.method.service;

public class NumberServiceV7 {

	String[] sub;
	InputService inputService;

	public NumberServiceV7() {

		sub = new String[5];
		sub[0] = "국어";
		sub[1] = "영어";
		sub[2] = "수학";
		sub[3] = "과학";
		sub[4] = "국사";

		inputService = new InputService();

	}

	public void inputScore() {

		for (int i = 0; i < sub.length; i++) {
			Integer retNum = inputService.inputValue(sub[i]);
			if (retNum == null) {
				System.out.println("입력종료");
				break;
			} 
			while(true) {
				
			}
			
		}
	}
}
