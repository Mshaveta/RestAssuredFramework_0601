package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static String readProperty(String propName) {
		Properties propObj = null;
		String propPath = System.getProperty("user.dir") + "\\config\\config.properties";
		try {
			FileInputStream fis = new FileInputStream(propPath);
			propObj = new Properties();
			try {
				propObj.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String baseUri = propObj.getProperty(propName);
		return baseUri;

	}

	 
}
