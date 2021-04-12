package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceV2 implements ScoreService {

	protected Scanner scan;

	public ScoreServiceV2() {

		scan = new Scanner(System.in);

	}

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 저장");
			System.out.println("QUIT. 종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				System.out.println("업무 종료");
				return;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("1,2,3,QUIT만 입력하세요");
				continue;
			}
			if (intM == 1) {
				this.inputScore();
			} else if (intM == 2) {
				this.printScore();
			} else if (intM == 3) {
				this.saveScore();
			} else {
				System.out.println("1,2,3,QUIT만 입력하세요");
				continue;
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
