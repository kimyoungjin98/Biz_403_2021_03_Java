package com.callor.app;

import com.youngjin.standard.InputService;
import com.youngjin.standard.impl.InputServiceImplV1;

public class InputEx_01 {

	public static void main(String[] args) {

		InputService isV1 = new InputServiceImplV1();
		isV1.inputValue("새우깡");
		
		System.out.println(isV1.toString());
		
		
	}

}
