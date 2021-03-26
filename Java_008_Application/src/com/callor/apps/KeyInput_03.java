package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int lineLength = 20;
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("입력한 두 정수의 사칙연산");
		System.out.println(LinesService.dLines(lineLength));
		System.out.print("정수 1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = scan.nextInt();
		System.out.println(LinesService.sLines(lineLength));
		System.out.println("사칙연산의 결과값");
		System.out.println(LinesService.sLines(lineLength));
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %3.2f\n", num1, num2, (float)num1/num2);
		System.out.println(num1 + " % " + num2 + " = " +(num1%num2));
		
		
		System.out.println(LinesService.dLines(20));
	}
}
