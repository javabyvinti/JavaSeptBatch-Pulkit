package com.bmpl.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UserAuthentication {

	String pathOfFile = "E://userdetails.doc";
	
	File file = new File(pathOfFile);
	
	void readUserDetails(String name, String password){
		
		try {
			FileInputStream fin = new FileInputStream(file);
			
			String userData = name.concat(password);
		
			String data = "";
			int i = 0;
			
			while(fin.read()!=-1)
			{
				while((i = fin.read())!=10){
					
					if(data.isEmpty()){
					
						data = String.valueOf((char)i);
					}
					else{
						data = data.concat(String.valueOf((char)i));	
					}	
				}
				if(data.equals(userData)){
					System.out.println("Authentication Successfull");
					System.out.println("Welcome "+name);
					//break;
				}else{
					System.out.println("Not matched");
				}
				
			}
				
				
			//System.out.println(data);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
