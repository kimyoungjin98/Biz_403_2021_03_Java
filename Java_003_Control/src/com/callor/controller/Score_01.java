package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		int intSum = 0;
		intSum = intKor + intEng + intMath;
		int intAvg = 0;
		intAvg = intSum / 3;
		
		System.out.println("============================");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("----------------------------");
		System.out.printf("총점 : %d  " , intSum);
		System.out.printf("평균 : %d\n" , intAvg);
		System.out.println("=============================");
		
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";
		String strSum = "총점";
		String strAvg = "평균";
		
		System.out.println("=============================");
		System.out.printf("%s : %d\n" , strKor, intKor);
		System.out.printf("%s : %d\n" , strEng, intEng);
		System.out.printf("%s : %d\n" , strMath, intMath);
		System.out.println("-------------------------------");
		System.out.printf("%s : %d  " , strSum, intSum);
		System.out.printf("%s : %d\n" , strAvg, intAvg);
		System.out.println("===============================");
		
		
		System.out.println("=============================");
		System.out.printf("국어 : %d\n " , intKor);
		System.out.printf("영어 : %d\n " , intEng);
		System.out.printf("수학 : %d\n " , intMath);
		System.out.println("-------------------------------");
		
		/*
		 * printf()를 사용하여 출력할 때 
		 * %d : 정수(십진수)
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * 
		 * \n : Enter를 누른 것 처럼 줄바꿈 실행
		 * \t : Tab키를 누른 것 처럼 사이띄기를 일정하게 맞추어라
		 */
		
		System.out.printf("총점 : %d\t평균 : %d " , intSum , intAvg);
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
