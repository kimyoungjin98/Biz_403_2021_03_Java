package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// 과목 3가지를 학생수 만큼 배열을 선언
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		int[] sum = new int[5];
		float[] avg = new float[5];

		int TotalKor = 0;
		int TotalEng = 0;
		int TotalMath = 0;
		int Total = 0;

		for (int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;

			TotalKor += intKor[i];
			TotalEng += intEng[i];
			TotalMath += intMath[i];

		}
		for (int i = 0; i < 5; i++) {
			sum[i] += intKor[i];
			sum[i] += intEng[i];
			sum[i] += intMath[i];

			Total += sum[i];
		}

		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			System.out.print(sum[i] + "\t");
			avg[i] = (float) sum[i] / 3;
			System.out.printf("%3.2f\n", avg[i]);
		}
		System.out.println("====================================================");
		System.out.print("총점\t");
		System.out.print(TotalKor + "\t");
		System.out.print(TotalEng + "\t");
		System.out.print(TotalMath + "\t");
		System.out.println(Total);
	}

}
