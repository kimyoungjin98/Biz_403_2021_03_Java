package com.callor.apps.service;

import java.util.Random;

// 클래스 선언문(시작하는 곳)
public class EvenServiceV1 {

	int[] intNum;
	int intSum;
	
	// 생성자 method
	// 클래스를 선언하면
	// 자동으로 만들어지는 method
	// 별도의 코드가 필요없으면 만들지 않아도 된다
	// new EvenServiceV1() 코드에서 호출되는 method
	// 생성자 method 에는 클래스 영역의 변수들을 
	// 초기화, 생성하기 위한 코드들이 작성된다.
	public EvenServiceV1() {
		intNum = new int[100]; // 생성은 생성자에서
	}

	/*
	 * 1시간에 90km를 갈수있는 속도로 달려라
	 * 
	 * 90km/h 속도로 달려라
	 */
	
	public void makeNums() {
		Random rnd = new Random();
		// intNums 배열 갯수만큼 코드를 반복실행하라
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
	}

	/*
	 * 짝수(Even) 홀수(Odd)
	 */
	
	public void printNums() {
		int nCount = 0;
		System.out.println("=============================");
		System.out.println("짝수들의 리스트");
		System.out.println("-------------------------------");
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i]);
				nCount++;
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들의 갯수 : " + nCount);
		System.out.println("-----------------------------");
		System.out.println("합계 : " + intSum);
		System.out.println("===============================");

	}
}