package com.callor.app.service;

import com.youngjin.standard.InputService;
import com.youngjin.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {

	InputService inService;
	int sum;
	float avg;
	
	public ScoreServiceV1() {
		 inService = new InputServiceImplV1();
	}
	
	public void inputScore() {
		
		Integer kors = inService.inputValue("국어", 0, 100);
		if(kors == null) {
			return;
		}
		Integer engs = inService.inputValue("영어", 0, 100);
		if(engs == null) {
			return;
		}
		Integer maths = inService.inputValue("수학", 0, 100);
		if(maths == null) {
			return;
		}
		sum = kors + engs + maths;
		avg = (float)sum / 3;
		
		this.printScore();
		
	}
	
	public void printScore() {
		System.out.println("=".repeat(30));
		System.out.printf("총점 : %d\t" , sum);
		System.out.printf("평균 : %3.2f" , avg);
		
	}
	
}
