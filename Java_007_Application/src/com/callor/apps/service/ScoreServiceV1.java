package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {

	public ScoreServiceV1() {

		int[] intKor;
		int[] intEng;
		int[] intMath;

		int[] intTotal;
		float[] floatAvg;
		
	}

	public void makeScore() {
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
	}

	public void PrintScore() {
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] intTotal = new int[10];
		float[] floatAvg = new float[10];
		Random rnd = new Random();
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		for (int i = 0; i < 10; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
			intTotal[i] += intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
			System.out.printf("%d\t%d\t%d\t%d\t%3.2f\n", 
					intKor[i], intEng[i], intMath[i],intTotal[i],floatAvg[i]);
		}
		 
		
	}

	}


