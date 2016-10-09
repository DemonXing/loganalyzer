
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class regex {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\eclipse\\bin\\Nitin-test\\src\\actualLog.log");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
						
			
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			
			while ((line = bufferedReader.readLine()) != null) {
				
				if(stringBuffer.toString() == "11/24")
				{
					System.out.println("date matched");
				}
				
			}
			

			fileReader.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}