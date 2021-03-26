package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(LinesService.dLines(30));
		System.out.println("정수를 입력하세요");
		System.out.println(LinesService.dLines(30));
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		System.out.println(LinesService.sLines(30));
		if (num % 2 == 0) {
			System.out.print(num + "은(는) 짝수입니다");
		} else {
			System.out.println(num + "은(는) 짝수가 아닙니다");
		}

		// 소수 판별을 하는 2 ~ (자신 -1) 수로 나누었을 때
		// 0인 경우가 한번도 없어야 된다
		int nums = 0;
		for (nums = 2; nums < num; nums++) {
			if(num % nums == 0) {
				break;
			}

		}
		if(nums < num) {
			System.out.println(num + "는 소수가 아닙니다");
		}else {
			System.out.println(num + "는 소수입니다");
		}

	}

}
