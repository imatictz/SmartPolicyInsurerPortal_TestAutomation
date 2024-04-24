package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader{
	private Properties properties;
	private final String propertyFilePath= "src//test//resources//Parameters//Config.properties";
		
    public ConfigReader(){
		BufferedReader reader;
		try {
		  reader = new BufferedReader(new FileReader(propertyFilePath));
		  properties = new Properties();
		try {
		  properties.load(reader);
		  reader.close();
		} 
		catch (IOException e) {
		  e.printStackTrace();
		}
		} 
		catch (FileNotFoundException e) {
		  e.printStackTrace();
		  throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} 
	 }
		 
    public String getDriverPathChrome(){
		String driverPath = properties.getProperty("driverPathChrome");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	}
		 
	public String getDriverPathFF(){
	    String driverPath = properties.getProperty("driverPathFF");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	}
		 
	public String getDriverPathMicroSoft(){
		String driverPath = properties.getProperty("driverPathMicroSoft");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	}
		 
	public long getImplicitlyWait(){ 
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	}
		 
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
		
	public String getBrowserName() {
	    String url = properties.getProperty("browserName");
		if(url != null) return url;
		else throw new RuntimeException("browserName not specified in the Configuration.properties file.");
	}
		
	public String sendUserId() {
		String url = properties.getProperty("userId");
		if(url != null) return url;
		else throw new RuntimeException("userId not specified in the Configuration.properties file.");
	}
		
	public String sendPassword() {
		String url = properties.getProperty("password");
		if(url != null) return url;
		else throw new RuntimeException("password not specified in the Configuration.properties file.");
	}
}


