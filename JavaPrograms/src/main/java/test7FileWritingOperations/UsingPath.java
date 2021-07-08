package test7FileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		// this is also writes bytes array
		String location= "UsingPath.txt";
		String content="Learning java is very easy";
		
		Path path= Paths.get(location);
		Files.write(path,content.getBytes());
	}

}
