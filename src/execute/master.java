package execute;

import java.io.IOException;

import io.TestRead;
import io.TestWrite;

/**
 * 
 * @author CJ
 *
 */
public class master{

	public static void main (String args[]) throws Exception
	{
		TestRead tr=new TestRead();
		TestWrite tw=new TestWrite();
		String data=null;
		String date=tr.Askdate();
	
		while(null!=tr.readerFile()){
			data=tr.readerFile();
			data=tr.Patternmatch(date,data);
			tw.writer(data);
		}
		
	}

}
