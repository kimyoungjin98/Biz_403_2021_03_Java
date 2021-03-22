package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
	
		Random rnd = new Random();
		int kor = rnd.nextInt(100) + 1;
		int eng = rnd.nextInt(100) + 1;
		int math = rnd.nextInt(100) + 1;
		int sum = 0;
		float avg = 0;
		sum += kor;
		sum += eng;
		sum += math;
		avg = (float)sum / 3;
		System.out.println("=======================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("------------------------");
		System.out.printf("총점 : %d\t", sum);
		System.out.printf("평균 : %3.2f", avg);
	}
	
}
