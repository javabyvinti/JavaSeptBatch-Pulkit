package com.bmpl.filehandling;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {

	public static void main(String[] args) {
		
		String originalPath = "D://TumHiho.mp3";
		String newPath = "D://TumHiho.mp3";
		
		
		
		//FileInputStream --> Reading
		//FileOutputStream --> Writing
		
//		try {
//			
//			FileInputStream fin = new FileInputStream(originalPath);
//		
//			FileOutputStream fout = new FileOutputStream(newPath);
//		
//			int i = 0;
//			
//			while((i = fin.read())!=-1){
//				fout.write((byte)i);
//			}
			
			//System.out.println("Data written");
			File file = new File(newPath);
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
