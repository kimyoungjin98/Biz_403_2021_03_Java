package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {

	public static void main(String[] args) {
		
		String readFile = "src/com/callor/score/student.txt";
		
		// 선언하는 코드와 생성하는 코드를 분리하자
		// FileWriter, FileReader : 파일을 Open
		// PrintWriter, BufferdReader : 내용을 쓰고 읽음
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			
			/*
			 * ============================================
			 * while(true) 반복문의 사용
			 * 1. 조건없이 무한반복을 수행하는 코드
			 * 2. 무한반복 코드를 수행하는 과정에서
			 * 	  if()조건문을 추가하여 반복을 중단하기
			 * 3. 무한반복에 조건을 부여하여 탈출구를 만들때
			 * 		일반적으로 쉽게 구현할 수 있는 코드
			 * 4. if() 조건문이 필요하고 
			 * 		때로는 추가되는 코드가 필요하기도 하다
			 * 5. 무한반복 코드가 실행되는 동안에 
			 * 		탈출구를 어떻게 만들지 고민해야 하고
			 * 6. 다양한 방법의, 다양한 조건의 탈출구를 
			 * 		필요할때 적절하게 구현할 수 있다
			 */
			
			// 파일을 무조건 한 라인씩 읽어라
			while(true) {
				String reader = buffer.readLine();
				// 파일의 끝에 다다르면 더 이상 읽지마라
				// EOF (End Of File) 가 되면 reader 변수에
				// 		null값이 담기게 된다
				// reader에 null값이 담겨 있다 == 다 읽었다
				if(reader == null) break; 
				String[] str = reader.split(":");
				System.out.println(str[1] + "\t" + str[5]);
				
			}
			//====================================================
			/* ===================================================
			 * while(조건식) 무한반복문
			 * 1. 무한반복코드가 중단되는 조건이 
			 * 		한개만 있을 경우 사용하기
			 * 2. 조건식을 어떻게 만들 것인가 잘 구상해야 한다
			 * 3. while(조건식)이 시작되기전에
			 * 		조건이 true가 되도록 만들어야 한다
			 * 4. 적절하게 탈출을 하려면 
			 * 		코드 내에서 조건식이 false가 되도록 연산을 
			 * 		수행해야 한다
			 * 5. 코드 내에서 조건식이 false가 되더라도 
			 * 		이후의 명령들이 한번씩 실행되고 나서 
			 * 		탈출이 이루어 진다
			 */
			
			// 문자열 변수 reader를 null이 아닌 값으로 
			// 		생성하기
			String reader = new String(); 
			
			// 최초에 while()문에서 reader != null은 true가 된다
			// != null 조건문을 실행하기 전에
			// reader = buffer.readLine()을 실행하고
			// reader 저장된 값이 null인지 비교한다
			// 1. reader = buffer.readLine()을 실행하고
			// 2. reader에 저장된 값을 마치 method가
			//		return 하는 것처럼 동작한다
			// 3. () return 하는 값이 null이 아닌가 비교한다
			// 4. 그 결과가 true이면 계속 코드 진행
			// 5. 그 결과가 false이면 즉시 while 명령이 끝난다
			
			while( (reader = buffer.readLine()) != null ) {
				// reader = buffer.readLine();
			}
			//===================================================
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(readFile + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		
	}
	
}
