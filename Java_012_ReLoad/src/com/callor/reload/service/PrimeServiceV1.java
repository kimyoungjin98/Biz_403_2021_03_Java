package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd;
	protected Integer intNum;

	public PrimeServiceV1() {

		rnd = new Random();

	}

	public void primeNum() {

		intNum = rnd.nextInt(51) + 50;

	}

	public void printNum() {
		int i;
		
		/*
		 * for() 반복문이 실행되거나 끝나는 경우
		 * 비교문 "i < intNum" 가 true인 동안 반복하라
		 * 만약 rndNum가 10이다
		 * 		i == 9 일때까지 반복하라
		 * for() 반복문이 종료되면 i는 얼마일까?
		 * i 값이 intNum보다 작으면 { } 내의 코드를 실행
		 * { } 실행 후에 i++를 실행한다
		 * i가 9가 되었을때 { } 를 실행하고
		 * 다시 한번 i++가 실행된다
		 * 때문에 for() 반복문이 중단되지 않고 모두
		 * 		정상수행이 되면
		 * 		i 값은 intNum값과 같아진다
		 * 		i == intNUm인데 i < intNum냐고 뭍는 것
		 * 
		 * 만약 for() 반복문이 중간에 break를 만났다
		 * 		i값은 항상 intNum보다 작다
		 */
		
		// intNum가 6이라고 가정 
		// 6 % 2 , 6 % 3 , 6 % 4 , 6 % 5
		boolean notPrime = false;
		for (i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				// 소수가 아닌 경우
				// intNum를 i값들로 나머지 연산을 했을때
				// 한번이라도 나머지가 0이면 그 수는 소수가 아닌경우
				// 그렇다면 그 이후에는 더이상 
				// 연산을 할 필요가 없다
				notPrime = true;
				break;
			}
		}// for() end
		 // 여기에서 for() 반복문이 break 되었냐?
		 // 아니면 모두 완료되었냐?
		if (i < intNum) {
			System.out.println(intNum + "는 소수가 아님");
		} else {
			System.out.println(intNum + "는 소수");
		}
	}
}
