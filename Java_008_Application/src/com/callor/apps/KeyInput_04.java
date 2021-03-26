package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		
		int linelength = 20;
		System.out.println(LinesService.dLines(linelength));
		System.out.println("5개의 정수값 입력과 합계");
		System.out.println(LinesService.sLines(linelength));
		for( int i = 0 ; i < 5 ; i++) {
			System.out.print("정수 " + (i+1) + " : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
		System.out.println(LinesService.sLines(linelength));
		System.out.print("입력한 정수 리스트 : ");
		System.out.println(Arrays.toString(num));
		System.out.println(LinesService.sLines(linelength));
		System.out.printf("합계 : %d\n" ,sum);
		System.out.println(LinesService.dLines(linelength));
		
	}

}
