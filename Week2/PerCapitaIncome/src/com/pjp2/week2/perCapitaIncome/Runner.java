package com.pjp2.week2.perCapitaIncome;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\kapil\\Desktop\\Sapient\\Assignments\\a3.csv";
		
		try {
			
	         File file = new File(path);
	         FileReader fileReader = new FileReader(file);
	         Scanner sc = new Scanner(fileReader);
	         
	         //to read the first line
	         String line = sc.nextLine();
	         System.out.println(line);
	         while(sc.hasNextLine()) {
	        	 //System.out.println(rd.nextLine());
	        	 DataHandler.parseInput(sc.nextLine());
	         }
	         sc.close();
        } catch(IOException e) {
           e.printStackTrace();
        }
		
	    DataHandler.evaluate();
	    DataHandler.writeData();
	}

}
