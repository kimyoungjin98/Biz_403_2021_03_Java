package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1A implements WordService {

	protected FileReader fileReader;
	protected BufferedReader buffer;
	protected List<WordVO> wordList;
	protected Scanner scan;

	protected final Integer 영어 = 0;
	protected final Integer 한글 = 1;

	public WordServiceImplV1A() {

		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);

		// word.txt 파일을 읽어서 wordList 데이터를 생성하는 method를
		// 생성자에서 호출하여
		// 이 클래스(WordService...V1)를 생성하면
		// 자동으로 실행되어 wordList 데이터를 준비하도록 하자

		this.loadWord();

	}

	@Override
	public void loadWord() {
		String fileName = "src/com/callor/score/word.txt";

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				String words[] = reader.split(":");

				WordVO vo = new WordVO();
				vo.setKorea(words[한글]);
				vo.setEnglish(words[영어]);
				wordList.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 여는동안 문제발생");
		} catch (IOException e) {
			System.out.println("파일에서 데이터 읽는중 문제발생");
		}

	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewWord() {

		int nWinCount = 0;
		int nLoseCount = 0;
		while (true) {
			WordVO vo = this.getWord();
			System.out.println(vo.toString());
			System.out.println("=".repeat(50));
			System.out.println("다음 뜻과 같은 영어 단어는?(Quit:그만하기)");
			System.out.println(vo.getKorea());
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strKor = scan.nextLine();
			if (strKor.equals("Quit")) {
				break;
			}

			if (strKor.equalsIgnoreCase(vo.getEnglish())) {
				System.out.println("참 잘했어요");
				nWinCount++;
			} else {
				System.out.println("좀 더 열심히 공부합시다@@");
				nLoseCount++;
			}
			System.out.println("=".repeat(50));
			System.out.println("지금까지 성공한 개수 : " + nWinCount);
			System.out.println("지금까지 실패한 개수 : " + nLoseCount);
			
			
		}
		System.out.println("Game Over !!");
	}

	protected WordVO getWord() {

		// TODO wordList에 담긴 데이터중 임의의 데이터 1개를 추출하여 보여주기
		Random rnd = new Random();
		rnd.nextInt(100); // 0 ~ 99까지 중의 정수 1개 생성

		int nSize = wordList.size();
		int num = rnd.nextInt(nSize); // 0 ~ (nSize-1) 중의 정수 1개 생성

		WordVO wordVO = wordList.get(num);
//		System.out.println(wordVO.toString());

		return wordVO;
	}

}
