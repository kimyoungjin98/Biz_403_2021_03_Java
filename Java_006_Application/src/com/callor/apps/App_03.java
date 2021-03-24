package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {

		int[] nums = new int[20];
		Random rnd = new Random();

		// 요소 : 배열의 몇 번째 값
		// 위치 : 배열의 몇 번째 
		// 첨자 : 배열의 몇 번째인가를 알려주는 값
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
			if (nums[i] % 2 == 0) {
				System.out.printf("%d번. %d\n", i, nums[i]);
			}
		}

	}

}
