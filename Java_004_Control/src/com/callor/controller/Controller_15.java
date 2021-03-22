package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		int stu = 0;
		int intSum = 0;
		float intAvg = 0;
		Random rnd = new Random();
		System.out.println("======================");
		for(int i = 0 ; i < 10 ; i++) {
			int num = rnd.nextInt(100) + 1;
			++stu;
			System.out.printf("학생 %d : %d\n",stu , num );
			intSum += num;
			intAvg = (float)intSum / 10;
		}
			System.out.println("------------------------");
			System.out.printf("총점 : %d , 평균 : %3.2f\n", intSum, intAvg );
			System.out.println("============================");
			
			
			}
	
}
