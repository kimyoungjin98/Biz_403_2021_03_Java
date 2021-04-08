package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {
	
	Scanner scan;
	
	
	public InputServiceV1() {
		
		scan = new Scanner(System.in);
		
	}

	public Integer inputValue(String title) {

		while(true) {
			
			System.out.println(title + " 값을 입력하세요");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			Integer intNum = null;
			if(strNum.equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT을 입력하세요");
				continue;
			}
			return intNum;
		}

	}

	public Integer inputValue(String title, int start) {

		
		return null;
	}

	public Integer inputValue(String title, int start, int end) {

		String msgTitle = String.format("%s(%d~%d)", title, start , end);
		
		this.inputValue(msgTitle);
		
		
		return null;
	}

}
