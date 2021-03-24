package com.callor.apps;

import java.util.Random;

public class App_01A {

	/*
	 * {}내에 있는 코드는 최소화 하자 작은 일들로 분해하기
	 * 
	 * 나누어서 정복하라 : Divide and Conquer
	 */
	public static void main(String[] args) {

		/*
		 * 배열의 크기를 변수에 설정해 두고 코드내에서 공통으로 사용하기
		 */
		int numsLength = 22;

		Random rnd = new Random();

		int[] num = new int[numsLength];
		int sum = 0;

		// 값을 배열에 저장
		for (int i = 0; i < numsLength; i++) {
			num[i] = rnd.nextInt(100) + 1;

		}

		// 짝수들의 리스트 출력
		for (int i = 0; i < numsLength; i++) {
			if (num[i] % 2 == 0) {
				sum += num[i];
				System.out.println(num[i]);
			}
		}
		System.out.println("------------------");
		System.out.println("합계 : " + sum);
	}
}
