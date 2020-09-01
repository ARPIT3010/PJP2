package com.pjp2.week2.perCapitaIncome;


import java.util.ArrayList;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;


public class DataHandler {

	static List<InputData> Input = new ArrayList<InputData>();
	static List<InputData> Output = new ArrayList<InputData>();

	public DataHandler(){}
	
	public static void parseInput(String line) {		
		System.out.println(line);
		String [] tempArr = line.split(",");
		try {
		Input.add(new InputData(tempArr[0],tempArr[1],tempArr[2],tempArr[3],Double.parseDouble(tempArr[4])));}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e )
		{
			System.out.println("array index out of bound or number format exception");
		}
	}
	
	private static boolean dataIsPresent(String country, String gender) {
		for(InputData x: Output) {
			if(x.getCountry().equals(country) && x.getGender().equals(gender)) {
				return true;
			}
		}
		return false;
	}
	
	private static void addData(InputData data) {
		Double sum = 0.0;
		int n=0;
		for(InputData x:Input) {
			if(x.getCountry() == data.getCountry() && x.getGender() == data.getGender()) {
				n+=1;
				sum += x.getAverageIncome();
			}
		}
		Output.add(new InputData(data.getCountry(),data.getGender(),sum/n));
	}
	
	public static void evaluate() {
		for(InputData data:Input) {
			if(!dataIsPresent(data.getCountry(),data.getGender()))
				addData(data);
		}
	}

	public static void writeData() {
		String output = "";
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\kapil\\Desktop\\Sapient\\Assignments\\output_assign3.csv");
				Collections.sort(Output);
				for(InputData detail : Output) {
					output+=detail;
					//System.out.println(detail);
				}
			fw.write(output);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
