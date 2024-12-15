package Project02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

	
	
	
	public static void start() throws FileNotFoundException, LinkedStringEmptyException {
		
		ArrayList<LinkedString> temp = new ArrayList<LinkedString>();
		create(temp);
		display(temp);
	}
	
	public static void create(ArrayList<LinkedString> temp ) throws FileNotFoundException, LinkedStringEmptyException {
		
		
		try {
			
			Scanner file = new Scanner(new File("./src/Project02/List.txt"));
			String temp1 = file.next();
			while(file.hasNext()) {
				
				temp.add(new LinkedString(temp1.toCharArray()));
				temp1 = file.next();
			}
		}
		catch(FileNotFoundException e) {
			throw new FileNotFoundException("Error");
		}
	}
	
	public static void display(ArrayList<LinkedString> temp) throws LinkedStringEmptyException {
	
		if(!temp.isEmpty()) {
			for(int i = 0; i < temp.size() ; i++) {
				System.out.println("length() method");
				System.out.println(temp.get(i).length());
				System.out.println("charAt() method");
				System.out.println(temp.get(i).charAt(0));
				System.out.println("substring() method");
				System.out.println(temp.get(i).substring(0,1).charAt(0));
				System.out.println("concat() method");
				
				for(int l = 0; l < temp.size() - 1; l++) {
					int len = (temp.get(l).concat(temp.get(l + 1))).length();
					String word = "";
				for(int k = 0; k < len; k++) {
					word+=  temp.get(i).concat(temp.get(i + 1)).charAt(k);
				}
				System.out.println(word);
				}
				
			}
			
		}
		
	
	
}
}