package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FIleWriter_02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/app/9981.txt";
				
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			
			
		} catch (IOException e) {
			System.out.println("파일을 만들수 없음");
		}

		
		
		
	}
	
}
