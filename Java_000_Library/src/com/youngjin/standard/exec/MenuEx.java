package com.youngjin.standard.exec;

import java.util.ArrayList;
import java.util.List;

import com.youngjin.standard.MenuService;
import com.youngjin.standard.impl.MenuServiceImplV1;

public class MenuEx {

	public static void main(String[] args) {
		
		List<String> menuList = new ArrayList<String>();
		menuList.add("성적입력");
		menuList.add("성적리스트출력");
		menuList.add("성적 저장");
		menuList.add("성적 정보 이메일 보내기");
		menuList.add("학생정보 입력");
		menuList.add("기타 여러가지");
		
		
		
		MenuService menuService = new MenuServiceImplV1("빛고을 고교 성적처리", menuList);
		
		Integer menu = menuService.selectMenu();
		System.out.println(menu);
		
	}
	
}
