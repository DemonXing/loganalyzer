package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;  
import java.util.Scanner;

/**
 * 
 * @author CJ
 *
 */
public class TestRead {
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public String readerFile() throws Exception 	{
/*		System.out.println(" Log File 1 data \n\n");

		BufferedReader br=null;
		StringBuilder sb =null;
		try {
		br = new BufferedReader(new FileReader("src/logs/actualLog.log"));
		sb = new StringBuilder();
		String line = br.readLine();

		while (line != null) {
			sb.append(line);
			sb.append("\n");
			line = br.readLine();
		}
		System.out.println(sb.toString()); 

		}catch(Exception ex){
			System.out.println("Exception"+ex);
		}
		return sb.toString();
*/
		File file= new File("src/logs/actualLog.log");
		file.	
		
		
		
		
		return null;
		
	}

	/**
	 * 
	 * @return
	 */
	public String Askdate()
	{
		System.out.println("\n\n-----*-----*-----*-----*-----\n\n");
		Scanner scan = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter Date(MM/DD) and press enter: \n");
		String date = scan.next();
		System.out.println("\nDate entered :"+date+"\n\n");

		scan.close();
		return date;
	}


	/**
	 * For matching patterns
	 * @param date
	 * @param mydata
	 * @return
	 */
	public String Patternmatch(String date,String mydata) 
	{

		int countDisconnect=0;

		Pattern patternName = Pattern.compile("ComputerName:(.*?)UserID");
		Pattern patternDate = Pattern.compile("\\((.*?)\\)");
		Pattern patternDisconnect = Pattern.compile("Client is disconnected from agent");

		Matcher Namematcher= patternName.matcher(mydata);
		Matcher Datematcher= patternDate.matcher(mydata);
		Matcher Disconnectmatcher=patternDisconnect.matcher(mydata);


		System.out.print("Computer Name \t Number Of Disconnects \n");
		if (Namematcher.find())
		{
			if(Datematcher.find())
			{
				System.out.print("\t"+Namematcher.group(1)+"\t\t");
				if(Disconnectmatcher.find()){
					countDisconnect++;
				}
			}
			System.out.println(countDisconnect);	
		}

		else{

			System.out.println("Match Not Found");
		} 
		return null;
	}

}