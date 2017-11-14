package com.bmpl.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

	public static void main(String[] args) {
		
		//Step-1 Create file using File class
		
		String pathOfFile = "E://firstfile.txt";
		
		File file = new File(pathOfFile);
		//Checked and Unchecked
		//Checked compiler
		try {
			if(file.exists()){
				System.out.println("File Exist");
				file.delete();
			} else{
				System.out.println("File created = " +file.createNewFile());
				//System.out.println("File Not Found");
			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
