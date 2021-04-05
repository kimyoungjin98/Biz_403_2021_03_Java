package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println(title + " 값을 입력하세요(QUIT : 종료)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			}
			
			Integer intNum = null;

			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수값만 입력하세요");
				continue;
			}
			if (intNum < 0) {
				System.out.println("입력 값 범위초과!");
				continue;
			}
			return intNum;
		}
	}

}
