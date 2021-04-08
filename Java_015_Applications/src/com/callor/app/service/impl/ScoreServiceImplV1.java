package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.youngjin.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	Scanner scan;
	List<ScoreVO> scoreList;
	InputServiceImplV1 inService;
	String strName;
	String strNum;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();

	}

	public void selectMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("학생 성적 입력 프로그램");
			System.out.println("=".repeat(50));
			System.out.println("1. 학생 성적 입력하기");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT. 종료하기");
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strMenu = scan.nextLine();
			Integer intMenu = null;
			if (strMenu.equals("QUIT")) {
				System.out.println("업무 종료");
				break;
			}
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("1,2,QUIT만 입력하세요");
				continue;
			}
			if (intMenu == 1) {
				this.inputName();
			} else if (intMenu == 2) {
				this.printScore();
			}
		}
	}

	public void inputName() {
//		while (true) {
//			System.out.println("학번을 입력하세요(QUIT:종료)");
//			System.out.print(">> ");
//			strNum = scan.nextLine();
//			if (strNum.equals("QUIT")) {
//				return;
//			}
//			try {
//				Integer intNum = Integer.valueOf(strNum);
//			} catch (NumberFormatException e) {
//				System.out.println("QUIT나 정수값만 입력하세요");
//				continue;
//			}
//			System.out.println("이름을 입력하세요(QUIT:종료)");
//			System.out.print(">> ");
//			strName = scan.nextLine();
//			if (strName.equals("QUIT")) {
//				return;
//			}
//			break;
//		}
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			strNum = String.valueOf(intNum);
			if (intNum == null) {
				return;
			}

			System.out.println("이름을 입력하세요(QUIT:종료)");
			System.out.print(">> ");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			}

			this.inputScore();
		}

	}

	public void inputScore() {

		String[] subject = new String[] { "국어", "영어", "수학" };
		Integer[] scores = new Integer[subject.length];
		for (int i = 0; i < subject.length; i++) {
			scores[i] = inService.inputValue(subject[i], 0, 100);
			if (scores[i] == null) {
				return;
			}
		}
		ScoreVO vo = new ScoreVO();
		vo.setKor(scores[0]);
		vo.setEng(scores[1]);
		vo.setMath(scores[2]);
		vo.setName(strName);
		vo.setNum(strNum);
		scoreList.add(vo);
		
		
	}

	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n", vo.getNum(), vo.getName(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAvg());
		}

	}

}
