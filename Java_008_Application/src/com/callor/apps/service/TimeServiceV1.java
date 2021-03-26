package com.callor.apps.service;

public class TimeServiceV1 {

	int[] nums;

	public TimeServiceV1() {

		nums = new int[8];

	}

	/*
	 * 배열은 총 8개 배열에 저장할 값은 2 ~ ??
	 */
	public void makeNum() {
		for (int i = 0; i < nums.length; i++) {
			int num = i + 2;
			nums[i] = num;

		}

	}

	/*
	 * 배열에 담긴 값(2~??) = 단
	 */
	public void printNum() {
		System.out.println("========================");
		System.out.println();
		for (int i = 0; i < nums.length; i++) {

			// method return ?? 명령문이 있으면
			// 변수 = method() 형식으로 코드를 작성하고
			// method가 return 해준 결과값을
			// 변수에 저장할 수 있다
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);

			System.out.println(dLines);
			System.out.printf("%d 단 구구단\n", nums[i]);
			System.out.println(sLines);
			
			for ( int j = 2 ; j < 10 ; j++) {
				System.out.printf("%d x %d = %d\n" , nums[i], j, (nums[i] * j));
			}
		}

	}
}
