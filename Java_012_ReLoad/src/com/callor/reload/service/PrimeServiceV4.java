package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> primeList;
	protected int[] intNum;

	public PrimeServiceV4() {

		rnd = new Random();
		primeList = new ArrayList<Integer>();
		intNum = new int[50];

	}

	public void primeNum() {
		int j = 0;
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
			boolean notPrime = false;
			for (j = 2; j < intNum[i]; j++) {
				if (intNum[i] % j == 0) {
					notPrime = true;
					break;
				}
				if (!notPrime ) {
					primeList.add(intNum[i]);
				} 
			}
		}
	}

	public void printNum() {
		System.out.println("소수의 리스트");
		System.out.println("-------------");
		for (int i = 0; i < intNum.length; i++) {
		System.out.println(primeList.get(intNum[i]));
		}

	}

}
