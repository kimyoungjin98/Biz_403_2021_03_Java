package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intScores = new int[10];
		int sum = 0;
		float avg = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
			System.out.println(intScores[i]);
			sum += intScores[i];
		}
		avg = (float)sum / 10;
		System.out.println("==========================");
		System.out.printf("총점 : %d, 평균 : %3.2f\n" , sum, avg);
		System.out.println("==========================");
		
		}
		
	
	
	
}
