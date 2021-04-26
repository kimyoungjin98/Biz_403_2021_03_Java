package com.callor.fine;

import java.util.ArrayList;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
}
