package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] nums = new int[20];

		for (int i = 0; i < 20; i++) {
			nums[i] = rnd.nextInt(51) + 50;
			int j = 0;
			for (j = 2; j < nums[i]; j++) {
				if(nums[i] % j == 0) {
					
				}
			}
		}
	}
}
