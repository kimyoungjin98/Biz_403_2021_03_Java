package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.ScoreService;
import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;
import com.youngjin.standard.InputService;
import com.youngjin.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected InputService inService;
	protected StudentService stService;

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV1() {

		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		stService = new StudentServiceImplV1();

	}

	protected String inputNum() {

		while (true) {

			Integer intNum = inService.inputValue("학번", 1);
			String strNum = String.format("%05d", intNum);
			if (intNum == null) {
				return null;
			}

			int i = 0;
			int nSize = scoreList.size();
			for (i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				if (vo.getNum().equals(strNum)) {
					break;
				}
			}
			if (i < nSize) {
				System.out.println("이미 입력한 학번입니다");
				continue;
			}
			return strNum;

		}

	}

	@Override
	public void insertScore() {

		// 유효성 검사가 끝난 후 학번을 가지고
		// VO에 담아야 하기때문에 while() 전에 선언
		
		while(true) {
		
			String strNum = null;
			while (true) {
				Integer intNum = inService.inputValue("학번", 1);
				if (intNum == null) {
					return;
				}
				strNum = String.format("%05d", intNum);
				ScoreVO scoreVO = this.numCheck(strNum);
				if(scoreVO != null) {
					continue;
				}
				// 학번에 해당하는 점수가 없다 !
				// 학생정보에 등록된 학번인가를 검사하여
				// 학생정보에 없으면 다시 학번을 입력받고
				// 있으면 점수를 입력받도록 break;
				StudentVO stVO = stService.getStudent(strNum);
				if(stVO == null) {
					System.out.println("학적부에 없는 학생입니다!!");
					System.out.println("학번을 다시 입력해 주세요");
					continue;
				}
				// 여기에 도달하면 학적부에 있는 학번이다
				System.out.println("=".repeat(30));
				System.out.printf("학번 : %s\n", stVO.getNum());
				System.out.printf("이름 : %s\n", stVO.getName());
				System.out.printf("학과 : %s\n", stVO.getDept());
				System.out.printf("학년 : %s\n", stVO.getGrade());
				System.out.printf("주소 : %s\n", stVO.getAddress());
				System.out.println("=".repeat(30));
				System.out.println("학생정보가 맞습니까?");
				System.out.println("맞으면 : Enter, 틀리면 : NO ");
				System.out.print(">> ");
				String yesNo = scan.nextLine();
				if(yesNo.equals("NO")) {
					continue;
				}
				break;
			}
			

			String subject[] = { "국어", "영어", "수학" };
			Integer scores[] = new Integer[subject.length];
			for (int i = 0; i < subject.length; i++) {
				scores[i] = inService.inputValue(subject[i], 0, 100);
			}
			ScoreVO vo = new ScoreVO();
			vo.setKor(scores[국어]);
			vo.setEng(scores[영어]);
			vo.setMath(scores[수학]);
			vo.setNum(strNum);
			scoreList.add(vo);

			this.printScore();
		}
		
		
	} // end insertScore()

	// 파라메터로 전달받은 학번이 scoreList에 있는지 검사
	// 있으면 scoreVO를 return
	// 없으면 null을 return
	protected ScoreVO numCheck(String num) {
		for (ScoreVO vo : scoreList) {
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}

		return null;
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		int nSize = scoreList.size();
		int i = 0;
		for(i = 0 ; i < nSize ; i++) {
			
			ScoreVO vo = scoreList.get(i);
			String index = String.format("%05d", i);
			StudentVO stVO = stService.getStudent(index);
			
			if(stVO == null) {
				continue;
			}
			
			System.out.print(stVO.getNum() + "\t");
			System.out.print(stVO.getName() + "\t");
			System.out.print(stVO.getDept() + "\t");
			System.out.print(stVO.getGrade() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());
			
			
		}
		
		System.out.println("=".repeat(80));
		
	}

}

