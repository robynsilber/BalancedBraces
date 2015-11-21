package testTool;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	public File file;
	public ArrayList<String> readFile(String filename){
		ArrayList<String> AL = new ArrayList<String>();
//		String lineOfText = "";
		String lineOfText;
		try{
			file = new File(filename);
			//System.out.println(file.getPath());
			Scanner fileScan = new Scanner(file);
		
			while(fileScan.hasNextLine()){
				lineOfText = fileScan.nextLine();
				AL.add(lineOfText);
			}
			fileScan.close();
		
		}catch(Exception e){
            //excptn.printStackTrace();
        }
		//System.out.println(AL);
		return AL;
	}
}
