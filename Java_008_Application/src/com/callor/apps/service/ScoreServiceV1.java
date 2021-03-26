package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan = new Scanner(System.in);
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intSum;
	float[] floatAvg;

	public ScoreServiceV1() {

		intKor = new int[5];
		intEng = new int[5];
		intMath = new int[5];
		intSum = new int[5];
		floatAvg = new float[5];
	}

	public void score() {
		System.out.println(LinesService.dLines(30));
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("학생 %d 국어성적 : ", i + 1);
			intKor[i] = scan.nextInt();
			System.out.printf("학생 %d 영어성적 : ", i + 1);
			intEng[i] = scan.nextInt();
			System.out.printf("학생 %d 수학성적 : ", i + 1);
			intMath[i] = scan.nextInt();
		}
		System.out.println(LinesService.sLines(30));
	}

	public void total() {
		for (int i = 0; i < intKor.length; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
			floatAvg[i] = intSum[i] / 3;
			System.out.print(intSum[i]);
		}

	}


}
