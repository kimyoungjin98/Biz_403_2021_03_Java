package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] nums = new int[10];

		for (int i = 0; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0 ; i < nums.length ; i ++) {
			// 리스트를 한줄에 출력 
			System.out.print(nums[i] + "\t");
			// 5번째 요소를 출력한 후 Enter를 눌러서
			// 다음 요소는 줄바꿈 하도록 하라 
			if((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

}
