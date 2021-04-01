package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV5() {

		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}

	public void inputNum() {

		System.out.print(">> ");
		String strNum1 = scan.nextLine();
		Integer num1 = Integer.valueOf(strNum1);

		while (true) {

			System.out.print(">> ");
			String strNum2 = scan.nextLine();
			Integer num2 = Integer.valueOf(strNum2);

			NumberVO vo = new NumberVO();
			vo.setNum1(num1);
			vo.setNum2(num2);

			if (num1 < num2) {
				System.out.println("두번째 숫자는 첫번째 숫자보다 작아야함");
				continue;
			} else {
				numList.add(vo);
				break;
			}
		}
	}

	public void printNum() {
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			this.printNum(vo);
		}
	}

	public void printNum(NumberVO vo) {
		System.out.println("=====================================");
		System.out.print("입력한 정수 1 : " + vo.getNum1() + "\t");
		System.out.println("입력한 정수 2 : " + vo.getNum2());
		System.out.println("=====================================");
		System.out.printf("정수1 - 정수2 : %d ", vo.getNum1() - vo.getNum2());
	}
}
