package PJP2.Week2.FeeCalc;

import java.util.List;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;


public class ManageData {
	
	// After reading input file making array of logs to shortlist transactions type
	static List<Transaction> Logs=new ArrayList<Transaction>();
			
	public static void parseInput(String record) {
	  System.out.println(record);
	  //split the record
	  String[] temp=record.split(",");
	  if(temp[2].equals("")) //if the transaction is a normal
	  {
		  Logs.add(new ProcessNormal(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),temp[3],temp[4],Integer.parseInt(temp[5]),temp[6] == "Y" ? true : false));
	  }
	  else //for intra day transaction
	  {
		  Logs.add(new ProcessIntraDay(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),temp[2],temp[3],temp[4],Integer.parseInt(temp[5])));
	  }	
	}
  // Writing to output csv file
	public static void Write()
	{
		String result="";
		try {
		//creating a output csv file
		FileWriter fw=new FileWriter("C:\\Users\\kapil\\Desktop\\Sapient\\sample_output.csv");
		Collections.sort(Logs);
		
		for(Transaction tr:Logs)
		{
			result+=tr;
		}
		fw.write(result);
		fw.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

