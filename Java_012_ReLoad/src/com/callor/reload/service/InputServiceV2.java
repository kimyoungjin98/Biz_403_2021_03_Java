package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;
	protected int intNum;

	// 클래스 영역에 선언된 변수는 멤버변수라고 하고
	// 멤버변수는 이 클래스의 어떤 method에서든지
	// 자유롭게 접근하여 저장, 읽기가 가능하다

	public InputServiceV2() {

		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		// method의 { } 에 선언된 변수는 지역변수 라고 한다
		// 지역변수는 { } 벗어나면 변수가 소멸된다
		// { } 이 서로 다르면 이름은 같아도 절대 접근이 불가능
		// 멤버변수에 같은 이름의 변수가 있는데
		// 지역변수에 같은 이름으로 변수를 또 선언하면
		// 멤버변수는 감춰져서 접근이 불가능
	}

	public void inputNum() {

		while (true) {
			System.out.println("50 ~ 150까지 정수입력");
			System.out.print(">> ");
			intNum = scan.nextInt();
			if (intNum > 50 && intNum < 150) {
				intList.add(intNum);
				break;
			} else {
				System.out.println("50 ~ 150까지만 입력하세요");
			}
		}
	}

	public void printNum() {
		System.out.println("=".repeat(30));
		System.out.println(intList.get(intNum));

	}

}
