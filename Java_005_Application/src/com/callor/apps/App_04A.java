package com.callor.apps;

import java.util.Random;

public class App_04A {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intClass1 = rnd.nextInt(10) + 50;
		int intClass2 = rnd.nextInt(10) + 50;
		int intClass3 = rnd.nextInt(10) + 50;
		int intClass4 = rnd.nextInt(10) + 50;
		int intClass5 = rnd.nextInt(10) + 50;
		
		
		//1반
		int intTotal = 0;
		System.out.println("==========================");
		System.out.println("인원수\t피자주문\t전체");
		System.out.println("-------------------------------");
		int pizzaBox = intClass1 / 6;
		if(intClass1 % (pizzaBox*6) > 0) {
			pizzaBox++;
		}
		System.out.print(intClass1 + "\t");
		System.out.print(pizzaBox+ "\t");
		System.out.println(pizzaBox * 6+ "\t");
		
	}
	
	
}
