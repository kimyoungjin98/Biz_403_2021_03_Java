package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV4() {

		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();

	}

	public void inputNum() {

		System.out.print(">> ");
		String strNum1 = scan.nextLine();
		Integer num1 = Integer.valueOf(strNum1);
		System.out.print(">> ");
		String strNum2 = scan.nextLine();
		Integer num2 = Integer.valueOf(strNum2);

		NumberVO vo = new NumberVO();
		vo.setNum1(num1);
		vo.setNum2(num2);

		numList.add(vo);
	}

	public void printNum() {
		System.out.println("--------------------");
		for (int i = 0 ; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			this.printNum(vo);
			
		}
	}
	public void printNum(NumberVO vo) {
		System.out.print(vo.getNum1() + "\t");
		System.out.println(vo.getNum2());
	}
}
