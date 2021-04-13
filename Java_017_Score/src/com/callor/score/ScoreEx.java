package com.callor.score;

import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV2;

public class ScoreEx {

	public static void main(String[] args) {
	
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV2();
		
		ssV1.selectMenu();
		
		
	}
	
	
}
