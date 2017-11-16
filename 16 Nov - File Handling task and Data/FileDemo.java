package com.bmpl.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		//FileInputStream and FileOutputStream
		
		String path = "E://mydata.txt";

		File file = new File(path);
		
		try {
			FileWriter fileWriter = new FileWriter(file, true);
		
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("This is my data\n");
			

			bufferedWriter.close();
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			while((line = bufferedReader.readLine())!=null){
				System.out.println(line);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
