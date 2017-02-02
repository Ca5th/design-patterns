package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		CompressionContext compressionContext = new CompressionContext();		
		compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
		
		ArrayList<File> files = new ArrayList<File>();
		files.add(new File("example.txt"));
		
		compressionContext.createArchive(files);

	}

}
