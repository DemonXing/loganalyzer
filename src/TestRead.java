import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;  
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;;

public class TestRead {

	
	//Reading file
	public String readerFile() throws IOException 	{
		System.out.println(" Log File 1 data \n\n");

		BufferedReader br=null;
		StringBuilder sb =null;
		try {
			
	/*		FileReader fr=new FileReader("E:\\eclipse\\bin\\Nitin-test\\src\\actualLog.log");
			int i;
			while((i=fr.read())!= -1)
			{
				
				System.out.print((char)i);
				
			}
			fr.close();
	*/
			br = new BufferedReader(new FileReader("E:\\eclipse\\bin\\Nitin-test\\src\\actualLog.log"));
			sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			System.out.println(sb.toString()); 
	
		
		} catch(Exception ex){
			System.out.println("Exception"+ex);
		}
				return sb.toString();
				
	}
	
	
	//Date from user
	public String Askdate()
	{
		System.out.println("\n\n-----*-----*-----*-----*-----\n\n");
	Scanner r1 = new Scanner(System.in);  // Reading from System.in
	System.out.println("Enter Month in mm format and press enter: \n");

	int mm = r1.nextInt();
	System.out.println("Enter date in dd format and press enter: \n");
	int dd = r1.nextInt();

	String date=mm+"/"+dd;
	System.out.println("\nDate entered :"+date+"\n\n");
	
	r1.close();
	return date;
	}
	
	
	//Pattern Matching
	public void Patternmatch(String date) throws FileNotFoundException{
	File testFile = new File ("E:\\eclipse\\bin\\Nitin-test\\src\\actualLog.log");
    Scanner s = new Scanner(testFile);
    int count=0;

    String pattern=date;
   
    while(s.hasNextLine()){
        String line = s.nextLine();

        if (line.contains(pattern)){
            count++;

            
        } 
        
        
    }   System.out.println("Date found "+ count + " times");

    s.close();

    }

	

	/*
	public String Patternmatch(String date,String mydata) 
	{
		
		int countDisconnect=0;
		
		//Apply for all lines in file
	//String mydata = "[D44C] ComputerName:APT UserID:A0005 Kelley Zajac Station 1  LanId: | (11/24 18:53:52) | Client is connected to agent.";
	
	//Pattern classes for UName, Date, Disconnects, Drops, AvgLimitExceed
	
	Pattern patternName = Pattern.compile("ComputerName:(.*?)UserID");
	//Pattern patternDate = Pattern.compile("\\((.*?)\\)");
    String datepattern="11/24";

	Pattern patternDisconnect = Pattern.compile("Client is disconnected from agent");

	//Matcher classes for UName, Date, Disconnects, Drops, AvgLimitExceed
	//Datematcher not working
	
	Matcher Namematcher= patternName.matcher(mydata);
	//Matcher Datematcher= patternDate.matcher(mydata);
	Matcher Disconnectmatcher=patternDisconnect.matcher(mydata);
	
	
	//Filter Data for No. of Disconnects
	
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

	*/
	
}