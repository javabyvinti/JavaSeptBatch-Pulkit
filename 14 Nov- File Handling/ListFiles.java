package com.bmpl.filehandling;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		
		File file = new File("E://");
		
//		System.out.println("Is Hidden = " + file.isHidden());
		String files[] = file.list();
		
		File myFiles[] = file.listFiles();
		
		for(File f : myFiles){
			System.out.println(f);
		}
		
		for(String s : files){
			System.out.println(s);
		}
		
		System.out.println("Total data = " + myFiles.length);
	}
}