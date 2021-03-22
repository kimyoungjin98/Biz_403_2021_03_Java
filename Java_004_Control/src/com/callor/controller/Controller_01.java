package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {
		
		int intNum = 0;
		int intSum = 0;
		
		System.out.println("=================================");
		for(intNum = 0; intNum < 100 ; intNum++) {
			if(intNum % 3 == 0) {
			intSum += intNum;
			}
			
		}
		System.out.println("3의 배수의 합: " + intSum);
		intSum = 0;
		for(intNum = 0; intNum < 100 ; intNum++) {
			if(intNum % 4 == 0) {
			intSum += intNum;
			}
		}
		/*
		 *  여기서 else if를 사용하면
		 *  3의 배수이면서 4의 배수인 경우
		 *  3의 배수에는 합산(누적)이 되지만
		 *  4의 배수에는 누락이 됨
		 */
		
		System.out.println("4의 배수의 합 : " + intSum);
		intSum = 0;
		for(intNum = 0; intNum < 100 ; intNum++) {
			if(intNum % 3 == 0) {
				if(intNum % 5 == 0) {
					intSum += intNum;
				}
				
			}
		}
		System.out.println("3과 5의 배수의 합 : "+ intSum);
		System.out.println("===============================");
		
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num = 0;
		
		for(int i = 0; i < 100 ; i++) {
			if(i % 3 == 0) {
				num3 += i;
			}
			if(i % 4 == 0) {
				num4 += i;
			}
			if(i % 3 == 0) {
				if(i % 5 == 0) {
					num5 += i;
				}}
						
		}
		System.out.println(num5);
		System.out.println(num4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}
			
		}
		



