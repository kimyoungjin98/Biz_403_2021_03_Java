package com.callor.fine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService{

	private List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList();
		scan = new Scanner(System.in);
	}
	
	public void inputScore() {
		 	
	}
	
	public void printList() {
				
	}
	
}