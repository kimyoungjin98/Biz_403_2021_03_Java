package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

// V1에는 ScoreService 인터페이스가 impl 되어있기 때문에
// V1을 상속받으면 자동으로 인터페이스도 상속받게 된다
public class ScoreServiceImplV2 extends ScoreServiceImplV1A {

	ScoreService sService;

	public ScoreServiceImplV2() {

		sService = new ScoreServiceImplV1A();

	}


	private String inputNum1() {

		while (true) {
			String strNum = this.inputNum();
			if (strNum == null) {
				return null;
			}
			int num = 0;
			for (int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if (vo.getNum().equals(strNum)) {
					System.out.println("이미 있는 학번입니다");
					num++;
					break;
				}
			}
			if (num > 0) {
				continue;
			}
			return strNum;
		}
	}

	public void inputScore() {

		String strNum = this.inputNum1();
		if (strNum == null) {
			return;
		}

		String strName = this.inputName(strNum);
		if (strName == null) {
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
		scoreList.add(vo);
	}
}
