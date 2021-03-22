package com.callor.controller;

import java.util.Random;

public class Controller_12 {

	public static void main(String[] args) {
	
		Random rnd = new Random();
		
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {			
			int num = rnd.nextInt(100) + 1;
			if(num % 3 == 0) {
				sum += num;
				System.out.println(num + "는 3의 배수");
			}
			
		}
		// for() {} 안에서 선언된 변수는
		// for() {} 명령이 끝나면 소멸된다
		
		/*
		 * scope(범위) 라고 한다
		 * {} : 변수의 사용 범위를 제한하는 역할을 한다
		 * 
		 * 작성하는 코드는 main() {} 내에 있다
		 *  여기에서 선언된 모든 변수는 main() method가 종료하면 모두 소멸된다
		 * for(){} 내에 선언된 모든 변수는 
		 * 	for() 반복문이 종료되면 모두 소멸된다
		 * 
		 * if(){}내에 선언된 모든 변수는
		 * 	if()비교문이 종료되면 모두 소멸된다
		 * 
		 * for() {}, if() {} 명령이 시작되기 전에 
		 * 	선언된 변수들은 for(), if() 명령문 내에서 사용(저장,읽기)가 가능하고
		 * for(), if()명령이 종료되ㅐ어도 그 값을 유지하고 있다
		 * 
		 * for() 반복문이 수행되는 동안 어떤 값을
		 * 	누적(합산)하거나 할때 for() 반복문이 시작되기 전에
		 * 	변수를 반드시 선언하고 0으로 clear 하는것이 좋다
		 */
		
		System.out.println("============================");	
		System.out.println(sum);
		
		
	}
}
