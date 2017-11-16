package com.bmpl.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserRegistration {

	String pathOfFile = "E://userdetails.doc";
	
	File file = new File(pathOfFile);
	
	FileOutputStream fout;
	
	void storeUserDetails(String name, String password){

		try{
			fout = new FileOutputStream(file, true);
			
			fout.write(name.getBytes());
			
			fout.write(password.getBytes());
			
			fout.write("\n".getBytes());
			
			//fout.write(String.valueOf("\n").getBytes());
			
			System.out.println("Details Saved");
			
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
