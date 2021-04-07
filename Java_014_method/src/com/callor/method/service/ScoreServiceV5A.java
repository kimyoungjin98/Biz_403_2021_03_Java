package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5A {

	List<Integer> korList;
	List<Integer> engList;
	List<Integer> mathList;

	String[] subject;
	InputServiceV2 inService;

	public ScoreServiceV5A() {

		korList = new ArrayList<Integer>();
		engList = new ArrayList<Integer>();
		mathList = new ArrayList<Integer>();

		inService = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };

	}

	public void printScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		
		for(int index = 0 ; index < korList.size() ; index++) {
			System.out.print(korList.get(index)+"\t");
			System.out.print(engList.get(index)+"\t");
			System.out.print(mathList.get(index)+"\n");
		}
		System.out.println("=".repeat(50));
		
	}
	
	public void inputScore() {

		for (int st = 0; st < 5; st++) {
			Integer scores[] = new Integer[subject.length];
			for (int sb = 0; sb < subject.length; sb++) {

				scores[sb] = inService.inputValue(subject[sb], 0, 100);

			}
			// scores에는 한 학생의 국어,영어,수학 점수가 저장되어 있다
			korList.add(scores[0]);
			engList.add(scores[1]);
			mathList.add(scores[2]);

		}

	}
}
