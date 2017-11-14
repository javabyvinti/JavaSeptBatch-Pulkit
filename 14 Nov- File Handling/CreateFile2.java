package com.bmpl.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {

	public static void main(String[] args) {
		
		File file  = new File("E://a//b//c//d//file.txt");
		try {
			System.out.println("Directories created = " + file.getParentFile().mkdirs());
			System.out.println("File created = " + file.createNewFile());
			System.out.println("File Name = " + file.getName());
			System.out.println("Absolute Path = " + file.getAbsolutePath());
			System.out.println("Parent = " + file.getParent());
			System.out.println("Can Read = " +file.canRead());
			System.out.println("Can Write = " +file.canWrite());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Exception");
		}
	}
}