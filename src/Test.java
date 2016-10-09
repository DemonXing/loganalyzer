import java.io.IOException;

public class Test {
	
	public static void main (String args[]) throws IOException
	{
		
		
				//Calling TestRead to read file
				TestRead tr=new TestRead();
				
				String data=tr.readerFile();
				String date=tr.Askdate();
				tr.Patternmatch(date,data);
				
				
				//TestWrite tw=new TestWrite();
				
					//tw.writer(tr.readerFile());
		
		
	}

}
