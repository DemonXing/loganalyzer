import java.io.*;
public class TestWrite {
public void writer(String content){
	try{
		FileWriter fw=new FileWriter("E:\\eclipse\\bin\\Nitin-test\\src\\log2.txt",true);
		fw.write(content+"\n");
		fw.close();
	}
	
	catch(Exception e){System.out.println(e);}
System.out.println("Data Successfully Entered");
}
	
}
