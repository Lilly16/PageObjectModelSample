package test7FileWritingOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileInputSteam {

	public static void main(String[] args) throws IOException {
		// for writing raw byte array information(ex.images)
		
		String location= "UsingFileInputSteam.txt";
		String content = "Jesus bless my family and all people "
									+ "in the world";
				
		FileOutputStream outputstream=new FileOutputStream(location);
		byte[] writethis=content.getBytes();
		outputstream.write(writethis);
		outputstream.close();
		
	}

}
