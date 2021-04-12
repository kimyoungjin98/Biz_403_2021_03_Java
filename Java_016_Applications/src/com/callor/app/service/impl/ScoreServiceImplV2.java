package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.youngjin.standard.InputService;
import com.youngjin.standard.MenuService;
import com.youngjin.standard.impl.InputServiceImplV1;
import com.youngjin.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	protected Scanner scan;
	
	protected String subjectList[];
	protected Integer subScoreList[];
	

	public ScoreServiceImplV2() {

		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[] { subjectList.length };
		
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);

	}

	@Override
	public void selectMenu() {

		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는 것이 좋다
		 * 
		 * 하지만 객체를 생성할때 전달해야할 매개변수(파라메터)에 대하여 수행해야할 연산코드가 있을 경우는 객체를 사용하기 전에 객체를 생성하는
		 * 코드를 작성하여도 된다
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적 입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");

		menuService = new MenuServiceImplV1("빛고을고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무 종료 !");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}

		}

	}

	protected String inputNum() {

		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			String strNum = String.format("%03d", intNum);
			if (strNum == null) {
				return null;
			}
			int i = 0;
			for (i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if (vo.getNum().equals(strNum)) {
					break;
				}
			}
			if (scoreList.size() > i) {
				System.out.println(strNum + "는 이미 등록되어있습니다");
				continue;
			}
			return strNum;
		}

	}

	protected String inputName(String strNum) {

		while (true) {
			System.out.println(strNum + "학생의 이름을 입력하세요(QUIT:종료)");
			System.out.println(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return null;
			} else if (strName.equals("")) {
				System.out.println("이름은 반드시 입력하세요");
				continue;
			}
			return strName;
		}

	}

	// 학번 입력, 이름 입력, 과목별 성적 입력
	// ScoreVO 객체에 담고, list에 추가
	// = ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고
	// = scoreVO에 담고
	@Override
	public void inputScore() {

		String strNum = this.inputNum();
		if (strNum == null) {
			return;
		}

		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		String[] subject = new String[] { "국어", "영어", "수학" };
		int scores[] = new int[subject.length];
		for (int i = 0; i < subject.length; i++) {
			scores[i] = inService.inputValue(subject[i], 0, 100);
		}
		ScoreVO vo = new ScoreVO();
		vo.setKor(scores[0]);
		vo.setEng(scores[1]);
		vo.setMath(scores[2]);
		vo.setName(strName);
		vo.setNum(strNum);
		scoreList.add(vo);
	}

	@Override
	public void printScore() {
		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		System.out.print("학번\t");
		System.out.print("이름\t");
		for(int index = 0 ; index < subjectList.length ; index++) {
			System.out.print(subjectList[index] + "\t");
		}
		System.out.println();
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(80));

	}

	@Override
	public void saveScore() {
		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.println(">> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}
			
			FileWriter fileWriter = null;
			PrintWriter out = null;
			
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);
				
				int nSize = scoreList.size();
				
				/*
				 * 파일에 저장할때 
				 * 각 데이터를 컴마(,)로 구분하여 입력하고
				 * 파일이름을 *.csv로 저장하면
				 * excel에서 파일을 읽을 수 있다
				 * 
				 * csv : comma-separated-variables
				 * 	컴마로 값을 구분한 파일
				 */
				for(int i = 0 ; i < nSize ; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ",");
					out.print(vo.getName() + ",");
					out.print(vo.getKor() + ",");
					out.print(vo.getEng() + ",");
					out.println(vo.getMath());
					
					out.flush();
					out.close();
					System.out.println("저장완료");
				}
				
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다");
				System.out.println("파일 이름을 다시 입력해 주세요");
				continue;
			}
			return;
		}
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
