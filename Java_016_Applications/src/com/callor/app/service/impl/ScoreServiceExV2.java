package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.Values;

/*
 * selectMenu는 그대로 활용
 * inputScore()만 다시 작성
 */
public class ScoreServiceExV2 extends ScoreServiceImplV2{
	
	protected String subjectList[];
	protected Integer subScoreList[];
	
	// 과목명, 과목점수가 담긴 배열에 대한 위치를
	// 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여
	// 배열의 index 값을 상수로 선언해 둔다
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	public ScoreServiceExV2() {
		
		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[] { subjectList.length };
		
	}
	
	@Override
	public void inputScore() {
		
		Integer intNum = inService.inputValue("학번", 1);
		if(intNum == null) {
			return;
		}
		// 1을 입력했으면 001로 만들어라
		String strNum = String.format("%03d", intNum);
		
		String strName = null;
		while(true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:입력중단)");
			strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생 이름은 반드시 입력하세요");
				continue;
			}
			break;
		}
		
		// 각 과목의 점수를 별도로 입력받아 변수에 저장하기를
		// 하려고 하니 귀찮다 
		// 창조적 게으름을 피워보기
		
		// 입력받을 과목명을 배열 변수로 선언하고
		// String subject[] = {"국어","영어","수학"};
		// 과목수 만큼 점수를 저장할 배열을 선언
		// Integer[] intScore = new Integer[subject.length];
		
		for(int i = 0 ; i < subjectList.length ; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);
			if(subScoreList[i] == null) {
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);
		
		scoreVO.setKor(subScoreList[Values.국어]);
		scoreVO.setEng(subScoreList[Values.영어]);
		scoreVO.setMath(subScoreList[Values.수학]);
		
		// 디버깅 코드, VO에 담긴 데이터 확인하기
		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(scoreVO);
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
		
	}

	
	
}
