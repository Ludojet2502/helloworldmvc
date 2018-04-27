package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Read {
	Read(){
		
	}
	
	public void readFile() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\piers\\OneDrive - Association Cesi Viacesi mail\\Prosit 5\\Prosit 5.5 Maven\\Model.txt\\"), "UTF-8"));
		String line = reader.readLine();	
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}	
		reader.close();

	}
}
