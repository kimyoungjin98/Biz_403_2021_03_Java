package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		
		
	
		int pizzaPcs = 6;
		int totalPcs = 0;
		int pizzaBox = 0;
		int Sum = 0;
		Random rnd = new Random();
		int[] stu = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
		stu[i] = rnd.nextInt(10) + 50;
		pizzaBox = stu[i] / pizzaPcs;
		
		boolean bYes = stu[i] % (pizzaBox * pizzaPcs) == 0;
		if(!bYes) {
		pizzaBox++;
		}
				totalPcs = pizzaBox * pizzaPcs;
			Sum += pizzaBox;
		}
		System.out.println("==========================");
		System.out.println("인원수\t 피자주문\t전체조각수");
	}
	
}
