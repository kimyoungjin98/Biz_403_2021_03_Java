package com.callor.method.service;

public class NumberServiceV7 {

	InputService inputService;

	public NumberServiceV7() {

		inputService = new InputService();

	}

	public void inputScore() {

		String sub[] = { "국어", "영어", "수학", "과학", "국사" };
		Integer retNum = null;

		for (int i = 0; i < sub.length; i++) {
			while (true) {
				retNum = inputService.inputValue(sub[i]);
				if (retNum == null) {
					return;
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("범위 초과");
					continue;
				} else {
					System.out.println(sub[i] + "의 점수는 : " + retNum);
					break;
				}
			}
		}
		return;
	}
}
