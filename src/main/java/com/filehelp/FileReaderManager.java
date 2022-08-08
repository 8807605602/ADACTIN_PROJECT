package com.filehelp;

import java.io.IOException;

public class FileReaderManager {

	//private method casue of nobody use tis withouut permission
	
	public FileReaderManager() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public static FileReaderManager	instanceFRM()
	
	
	{
		FileReaderManager f =new FileReaderManager();
		return f;
		
	}
	
	public  Configuration_reader instanceCRM() throws IOException
	{
		Configuration_reader reader =new Configuration_reader();
		return reader;

	}
	
	
	
	
	
	
	
	
	
	
}
