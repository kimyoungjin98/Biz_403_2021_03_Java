package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected List<ScoreVO> scoreList;
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2() {

		scoreList = new ArrayList<ScoreVO>();

	}

	protected String inputNum() {

		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			String strNum = String.format("%03d", intNum);
			if (intNum == null) {
				return null;
			}
			int i = 0;
			for (i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if (vo.getNum().equals(strNum)) {
					break;
				}
			}
			if (i < scoreList.size()) {
				System.out.println("이미 입력된 학번입니다");
				continue;
			}
			return strNum;
		}

	}

	protected String inputName(String strNum) {

		while(true) {
			System.out.println(strNum + "학생의 이름을 입력하세요");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName == null) {
				return null;
			}
			if(strName.equals("")) {
				System.out.println("이름은 꼭 입력하세요");
				continue;
			}
			return strName;
			
		}
		
	}

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

		String[] subject = { "국어", "영어", "수학" };
		Integer scores[] = new Integer[subject.length];
		for (int i = 0; i < subject.length; i++) {
			scores[i] = inService.inputValue(subject[i], 0, 100);
		}
		ScoreVO vo = new ScoreVO();
		vo.setName(strName);
		vo.setNum(strNum);
		vo.setKor(scores[국어]);
		vo.setEng(scores[영어]);
		vo.setMath(scores[수학]);
		scoreList.add(vo);

	}

	@Override
	public void printScore() {
	
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMath()+"\t");
			System.out.print(vo.getTotal()+"\t");
			System.out.print(vo.getAvg()+"\n");
		}
		System.out.println("=".repeat(80));
		
	} // end printScore

	@Override
	public void saveScore() {
		
		String fileName = null;
		
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일 이름은 반드시 입력해야 합니다");
				continue;
			}
			break;
		}
	
		String strFileName = "src/com/callor/score/" + fileName; 
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i = 0 ; i < nSize ; i++) {
				ScoreVO vo = scoreList.get(i);
				out.print(vo.getNum() +"\t" );
				out.print(vo.getName() +"\t" );
				out.print(vo.getKor() +"\t" );
				out.print(vo.getEng() +"\t" );
				out.print(vo.getMath() +"\t" );
				out.print(vo.getTotal() +"\t" );
				out.printf("%3.2f\n", vo.getAvg());
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
