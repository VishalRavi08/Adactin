package com.reader;

import java.io.IOException;

public class FileReaderManager {
	
	//create a private constructor
	
	private FileReaderManager() {
		
		//restrict the object creation
	}
	
	public static FileReaderManager getInstanceFR() { //FR-FileReader
	
	FileReaderManager fr = new FileReaderManager();
	return fr;
	
	}
	
	public ConfigurationReader getInstanceCR() throws IOException{ //CR-ConfigurationReader
	
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
		
	}
	
	
}
