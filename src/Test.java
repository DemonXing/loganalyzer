import java.io.IOException;

public class Test {
	
	public static void main (String args[]) throws IOException
	{
		
		
				//Calling TestRead to read file
				TestRead tr=new TestRead();
				
				tr.readerFile();
				String date= tr.Askdate();
				tr.Patternmatch(date);
				
				
				//TestWrite tw=new TestWrite();
				
					//tw.writer(tr.readerFile());
		
		
	}

}
