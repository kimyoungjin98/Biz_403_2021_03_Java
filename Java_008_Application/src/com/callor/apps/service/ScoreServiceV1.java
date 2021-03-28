package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan = new Scanner(System.in);
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intSum;
	float[] floatAvg;
	
	int totalKor;
	int totalEng;
	int totalMath;
	int total;
	float avg;

	public ScoreServiceV1() {

		intKor = new int[5];
		intEng = new int[5];
		intMath = new int[5];
		intSum = new int[5];
		floatAvg = new float[5];
	}

	public void score() {
		System.out.println(LinesService.dLines(80));
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("학생 %d 국어성적 : ", i + 1);
			intKor[i] = scan.nextInt();
			System.out.printf("학생 %d 영어성적 : ", i + 1);
			intEng[i] = scan.nextInt();
			System.out.printf("학생 %d 수학성적 : ", i + 1);
			intMath[i] = scan.nextInt();
		}
		System.out.println(LinesService.sLines(80));
		scan.close();
	}

	public void total() {
		for (int i = 0; i < intKor.length; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
			floatAvg[i] = (float) intSum[i] / 3;
			totalKor += intKor[i];
			totalEng += intEng[i];
			totalMath += intMath[i];
		}
		total = totalKor + totalEng + totalMath;
		avg = (float)total / 3; 

	}

	public void printScore() {

		System.out.println("학생 성적 리스트");
		System.out.println(LinesService.sLines(80));
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("학생%d 국어성적 : %d\t| ", (i + 1), intKor[i]);
			System.out.printf("학생%d 영어성적 : %d\t| ", (i + 1), intEng[i]);
			System.out.printf("학생%d 수학성적 : %d\t| ", (i + 1), intMath[i]);
			System.out.printf("학생%d 총점 : %d\t| ", (i + 1), intSum[i]);
			System.out.printf("학생%d 평균 : %3.2f\n", (i + 1), floatAvg[i]);
		}
		System.out.println(LinesService.dLines(80));
		System.out.printf("국어 총합 : %d\t| " , totalKor);
		System.out.printf("영어 총합 : %d\t| " , totalEng);
		System.out.printf("수학 총합 : %d\t| " , totalMath);
		System.out.printf("과목 총합 : %d\t| " , total);
		System.out.printf("총합 평균 : %3.2f" , avg);

	}

}
