package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] num = new int[20];
		int sum = 0;

		for (int i = 0; i < 20; i++) {
			num[i] = rnd.nextInt(100) + 1;
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
				sum += num[i];
			}
		}
		System.out.println("-------------------------");
		System.out.println("합계 : " + sum);

	}

}
