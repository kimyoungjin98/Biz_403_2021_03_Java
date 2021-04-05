package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {
		// Scanner 선언, 생성
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("0 ~ 100까지 정수 입력(QUIT:종료)");
			System.out.print(">> ");
			// 키보드로 입력받아 저장할 strNum 변수 생성
			String strNum = scan.nextLine();
			// 입력받은 문자열을 정수형으로 변환할 intNum 선언
			Integer intNum = null;
			// strNum가 "QUIT"와 같으면 null값으로 return
			if (strNum.trim().equals("QUIT")) {
				return null;
			}
			// 키보드로 입력받은 strNum값을 정수형으로 변환후 intNum에 저장하고
			// try catch문으로 숫자만 입력하도록 검사
			try {
				intNum = Integer.valueOf(strNum); 
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수로만 입력하세요");
				continue;
			}
			if (intNum < 0 || intNum > 100) {
				System.out.println("0 ~ 100 까지만 입력하세요");
				continue;
			}
			return intNum;
		} // while() end
	}

}
