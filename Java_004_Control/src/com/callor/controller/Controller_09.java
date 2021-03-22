package com.callor.controller;

import java.util.Random;

public class Controller_09 {

	/*
	 * 0~100 까지 난수를 생성하고
	 * 그 숫자가 짝수인가 판별하라
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 0 ~ 99까지
		int num = rnd.nextInt(100);
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수");
		}else {
			System.out.println(num + "는 짝수 아님");
		}
		
	}
}
