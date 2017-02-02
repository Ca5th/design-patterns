package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	private CompressionStrategy compressionStrategy;

	public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
		this.compressionStrategy = compressionStrategy;
	}
	
	public void createArchive(ArrayList<File> files){
		this.compressionStrategy.compressFiles(files);
	}
}
