package com.bmpl.filehandling;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData2 {

	public static void main(String[] args) {
		
		String originalPath = "D://TumHiho.mp3";
		String newPath = "D://TumHihoCopy.mp3";
		
		try {
			
			FileWriter fileWriter = new FileWriter(newPath);
		
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			FileReader fileReader = new FileReader(originalPath);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			
			while((line = bufferedReader.readLine())!=null){
				bufferedWriter.write(line);
			}
			System.out.println("Data written");
		}
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			//System.out.println("Data written");
//			File file = new File(newPath);
//			try {
//				Desktop.getDesktop().open(file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		


	}

}
