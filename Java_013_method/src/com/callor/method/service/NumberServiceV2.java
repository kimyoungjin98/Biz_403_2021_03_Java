package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	/* 
	 * 정수를 키보드에서 입력받아
	 * 정수를 return하거나 : int 
	 * QUIT를 입력하면 null을 return : And = > Integer
	 * void 대신 Integer 
	 */
	Scanner scan;

	public NumberServiceV2() {

		scan = new Scanner(System.in);

	}

	public Integer inputNum() {

		System.out.println("0 ~ 100까지 정수입력(QUIT:종료)");
		System.out.print(">> ");
		String strNum = scan.nextLine();
		if (strNum.equals("QUIT")) {
			return null;
		} else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
	}
}
