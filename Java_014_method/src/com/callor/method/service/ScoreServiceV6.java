package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 데이터를 입력(키보드, Random, 파일, 인터넷)
 * 		데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 
 * 		연산을 수행
 *  
 * 다시 List 저장
 * 데이터를 읽어
 * 		List에서 추출하여 VO에 담고
 * 출력
 */
public class ScoreServiceV6 {

	// final 키워드를 부착한 변수 = 상수
	// 상수 = 한번 저장된 값을 변경할 수 없는 특별한 변수 
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	
	List<ScoreVO> scoreList;
	String subject[];
	InputServiceV2 inService;

	public ScoreServiceV6() {

		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };

	}

	public void inputScore() {

		Integer[] scores = new Integer[subject.length];
		for (int i = 0; i < 5; i++) {
			System.out.printf("[%d] 번째 학생의 점수를 입력하세요\n", (i + 1));
			for (int sb = 0; sb < subject.length; sb++) {
				scores[sb] = inService.inputValue(subject[sb], 0, 100);
				if (scores[sb] == null) {
					System.out.println("입력 종료!");
					return;
				}

			}
			ScoreVO scoreVO = new ScoreVO();
			int sbIndex = 0;
			scoreVO.setKor(scores[this.국어]);
			scoreVO.setEng(scores[영어]);
			scoreVO.setMath(scores[수학]);
			scoreVO.setTotal(scores[국어] + scores[영어] + scores[수학]);
			scoreList.add(scoreVO);

		}

		this.printScore();

	}

	public void printScore() {

		System.out.println("=".repeat(60));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO scoreVO = scoreList.get(i);
			float avg = (float) scoreVO.getTotal() / 3;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%3.2f\n", (i + 1), scoreVO.getKor(), scoreVO.getEng(),
					scoreVO.getMath(), scoreVO.getTotal(), avg);

		}
		System.out.println("=".repeat(60));

	}

	public void printScore1() {

		System.out.println("=".repeat(50));
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		System.out.println("-".repeat(50));

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\n");
		}

	}

	public void inputScore1() {

		for (int st = 0; st < 5; st++) {

			Integer intKor = inService.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어", 0, 100);
			if (intEng == null) {
				return;
			}
			Integer intMath = inService.inputValue("수학", 0, 100);
			if (intMath == null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			scoreList.add(scoreVO);
		}
		
		this.printScore1();
	}

}
