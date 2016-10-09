package io;

import java.io.*;
/**
 * 
 * @author CJ
 *
 */
public class TestWrite {
	public void writer(String content){
		try{
			FileWriter fw=new FileWriter("../logs/log2.txt",true);
			fw.write(content+"\n");
			fw.close();
		}

		catch(Exception e){System.out.println(e);}
		System.out.println("Data Successfully Entered");
	}

}
