package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;

	String subject[];
	Integer stu[];
	InputServiceV2 inService;

	public ScoreServiceV5() {

		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

		subject = new String[] { "국어", "영어", "수학" };
		inService = new InputServiceV2();
		stu = new Integer[5];

	}

	public void inputScore() {

		for (int index = 0; index < 5; index++) {
			System.out.printf("학생 %d 의 성적을 입력하세요\n", (index + 1));
			for (int i = 0; i < subject.length; i++) {
				Integer[] score = new Integer[subject.length];
				score[i] = inService.inputValue(subject[i], 0, 100);
				if (score[i] == null) {
					System.out.println("입력 종료");
					return;
//				} else if (subject[i].equals("국어")) {
//					kors.add(score[i]);
//				} else if (subject[i].equals("영어")) {
//					engs.add(score[i]);
//				} else {
//					maths.add(score[i]);
//				}
				}
				if(i == 0) {
					kors.add(score[0]);
				} else if (i == 1) {
					engs.add(score[1]);
				} else {
					maths.add(score[2]);
				}

			}
		}

		this.printScore();
	}

	public void printScore() {

		System.out.println("학번\t국어\t수학\t영어");
		System.out.println("=".repeat(30));
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번\t%d\t%d\t%d\n", (i + 1), kors.get(i), engs.get(i), maths.get(i));
		}

	}

}
