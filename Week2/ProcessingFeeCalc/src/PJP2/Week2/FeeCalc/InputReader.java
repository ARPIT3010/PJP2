package PJP2.Week2.FeeCalc;



import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputReader {
	public static void readinput(String inputfile)
	{
		
		try {
			File file=new File(inputfile);
			FileReader fileReader=new FileReader(file);
			Scanner sc=new Scanner(fileReader);
		    ManageData.parseInput(sc.nextLine().substring(3));
		    while(sc.hasNextLine())
		    {
		    	ManageData.parseInput(sc.nextLine());
		    	
		    }
		    sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
