package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1A {

	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;

	public ScoreServiceV1A() {

		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];

	}

	public void makeScore() {
		Random rnd = new Random();
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;

		}

	}

	public void makeSum() {
		for (int i = 0; i < intKor.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] = intMath[i];
			intTotal[i] = intEng[i];
			floatAvg[i] = (float) intTotal[i] / 3;
		}

	}

	public void printScore() {
		
		
	}

}