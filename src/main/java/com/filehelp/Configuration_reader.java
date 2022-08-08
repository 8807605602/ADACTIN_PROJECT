package com.filehelp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
	public static Properties p;

	public Configuration_reader() throws IOException {
		File f = new File(
				"C:\\Users\\Vike\\eclipse-workspace\\project_1\\src\\main\\java\\com\\filehelp\\configeration_properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getUsername()

	{
		String username = p.getProperty("Uname");
		return username;

	}

	public String getPw()

	{
		String pw = p.getProperty("pw");
		return pw;

	}

}
