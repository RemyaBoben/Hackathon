package com.java.hackathon.Hackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class ReadWriteFile {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		fileRead();
		//fileWrite();
	}
	public static void fileRead() throws Exception {
		String sFilePath = System.getProperty("user.dir")+"//SampleReadFile.txt";
		FileReader frObj = new FileReader(sFilePath);
		BufferedReader brObj = new BufferedReader(frObj);
		String sLine;
		ArrayList<String> alObj = new ArrayList<String>();
		while((sLine = brObj.readLine())!=null) {
			System.out.println(sLine);
			//fileWrite(sLine);
			alObj.add(sLine);
		}
		for(int i=alObj.size()-1;i>=0;i--) {
			fileWrite(alObj.get(i));
		}
		brObj.close();
	}
	public static void fileWrite(String sLine) {
		
		/*
		 * Now whenever you run it will overwrite on file,if you want to append
		 * you need to use FileWriter (String,boolean)--append
		 * 
		*/
		String sFilePath = System.getProperty("user.dir")+"//SampleWriteFile.txt";
		try {
			//FileWriter fwObj = new FileWriter(sFilePath);
			FileWriter fwObj = new FileWriter(sFilePath,true);
			BufferedWriter bwObj = new BufferedWriter(fwObj);
			bwObj.write(sLine);
			bwObj.newLine();
			bwObj.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
