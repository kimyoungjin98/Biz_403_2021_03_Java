package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("0 ~ 100까지 정수 입력(QUIT:종료)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if (strNum.trim().equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
				if (intNum < 0 || intNum > 100) {
					System.out.println("0 ~ 100 까지만 입력하세요");
					continue;
				}
				return intNum;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수로만 입력하세요");
				continue;
			}
		}
	}

}
