package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV2 extends ScoreServiceV1A{

	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;
	
	// for (int i = 0)
	// int members = 5
	// method의 괄호 안에 선언된 변수
	// 매개변수, parameter 라고 한다
	public ScoreServiceV2(int members) {

		intKor = new int[members];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];

			
	}

}