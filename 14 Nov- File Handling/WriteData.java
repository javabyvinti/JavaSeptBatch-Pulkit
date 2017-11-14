package com.bmpl.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		
		File file = new File("E://a//b//c//d//file.doc");
		// FileOutputStream --> to write data into file
		
		String data = "This is my data again for the file...\n";
		
		try {
			//FileInputStream
			FileOutputStream fout = new FileOutputStream(file, true);
		
			byte b[] = data.getBytes();
			
			fout.write(b);
			System.out.println("Data written");
			
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream(file);
			
			int i = 0;
			
			while((i= fin.read())!=-1){
				System.out.print((char)i);
			}
			
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}