package com.callor.score;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		String fileName = "src/com/callor/score/word.txt";
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String str[] = reader.split(":");
				System.out.println(str[0] + "\t" + str[1]);
			}
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
