package com.callor.apps;

import java.util.Random;

public class App_07 {
		/*
		 * 어떤 배열에 
		 * 7, 2, 4, 3, 1 이런 값이 저장되어 있을 때 
		 * 1, 2, 3, 4, 7 과 같이 정렬(Sort)하고자 할 때
		 * 
		 * 최초 : 7, 2, 4, 3, 1 일 때
		 * 0번 요소(7) 1번 요소(2) 두 값을 크기 비교
		 * 0번에 2를 저장, 1에 7을 저장하여 자리 바꿈
		 * 2, 7, 4, 3, 1로 만듦
		 * 
		 * 0번 요소(2), 2번 요소(4) 두 값을 크기 비교
		 * 4가 더 큰 값이므로 그냥 둔다
		 * 2, 7, 4, 3, 1로 유지
		 * 
		 * 0번 요소(2), 3번요소(3) 두 값을 크기 비교 
		 * 3이 더 큰 값이므로 그냥 둔다
		 * 
		 * 0번 요소(2), 4번 요소(1) 두 값을 크기 비교
		 * 2가 더 큰 값이므로 자리바꿈
		 * 
		 */


	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums = new int[5];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println("=========================");
		System.out.println("오름차순 정렬");
		System.out.println("-------------------------");
		
		
		/* 
		 * 두 변수의 값을 서로 교환
		 * 제 3의 임시저장소 변수가 필요하다
		 */
		
		int num1 = 30;
		int num2 = 40;
		int temp = num1; // num1의 값을 임시저장
		num1 = num2;
		num2 = temp;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
