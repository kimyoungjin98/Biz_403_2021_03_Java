package com.callor.var;

public class Varriable_15 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		// intNum 0, 2, 4, 6, 8, 10
		
		
		intNum += 2;
		intSum += intNum;
		intNum += 2;
		intSum += intNum;
		intNum += 2;
		intSum += intNum;
		intNum += 2;
		intSum += intNum;
		intNum += 2;
		intSum += intNum;
		
		System.out.println(intSum);
				
		intNum = 0;
		intSum = 0;
		
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		
		
		
		
	}
	
}
