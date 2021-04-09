package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.youngjin.standard.InputService;
import com.youngjin.standard.impl.InputServiceImplV1;

/*
 *  1. 메뉴를 보여주고
 *  2. 성적입력 : 학생수의 제한이 없다
 *  	가. 학번
 *  	나. 학생이름 : inputName()
 *  	다. 과목별 성적 : inputScore()
 *  
 *  	가. 학생성적 입력 : inputScore() 시작
 *  		- 학번입력
 *  		- 이름입력
 *  		- 점수입력
 *  	
 *  	나. 학생의 이름을 입력하는 inputName() method는
 *  		return type String 형이기 때문에
 *  		학생이름을 입력받고 입력받은 학생이름을 return
 *  		이 return 학생이름을 inputScore() 에서
 *  		변수에 담아 처리를 할수있다
 */
public class ScoreServiceImplV1A implements ScoreService {

	 
	// 학생의 이름을 입력받을때 사용할 객체
	protected Scanner scan;
	
	// 저장소
	protected List<ScoreVO> scoreList;
	
	// 학번, 점수를 입력받을때 사용할 객체
	protected InputService inService;

	public ScoreServiceImplV1A() {
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
				this.inputScore();
			} else if (intMenu == 2) {
				this.printScore();
			}
		}
	}

	public void inputName() {

	}

	protected String inputName(String strNum) {
		// TODO
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:종료)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return null;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
		}

	}
	
	/*
	 * 현재 클래스 내부에서만 호출되는 method private으로 선언한다
	 * 현재 클래스를 상속받아 확장하여 사용할수 있도록 하려면
	 * private => protected로 변경 해주는 것이 좋다
	 */
	protected String inputNum() {

		Integer intNum = inService.inputValue("학번", 1);
		String strNum = String.format("2021%03d", intNum);
		if (intNum == null) {
			return null;
		}
		
		return strNum;
	}

	public void inputScore() {

		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}

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
		
		// vo에 담긴 데이터를 List 저장소에 추가
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
